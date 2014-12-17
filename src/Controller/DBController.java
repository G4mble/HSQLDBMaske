package Controller;

import javax.swing.*;
import java.sql.*;

public class DBController
{
    private Connection connection = null;
    private ProgramController programController;

    /*Lädt Treiberklasse
    * baut Verbindung zur DB auf
    * err.prinln sonst*/
    public DBController(ProgramController paramProgramController)
    {
        this.programController = paramProgramController;

        try
        {
            Class.forName("org.hsqldb.jdbcDriver");
            System.out.println("Treiberklasse geladen.");
        }
        catch (ClassNotFoundException cnfE)
        {
            JOptionPane.showMessageDialog(null, "ErrorMessage: " + cnfE.getMessage() + "\nExceptionType: ClassNotFoundException" +
                    "\nTreiberklasse konnte nicht geladen werden!", "Fehler beim Laden der Datenbank", JOptionPane.ERROR_MESSAGE);
            this.closeConnection();
        }
        try
        {
            this.connection = DriverManager.getConnection("jdbc:hsqldb:file:data\\common\\db;ifexists=true;shutdown=true", "root", "");
            System.out.println("HSQLDB verbunden.");
        }
        catch (SQLException sqlE)
        {
            JOptionPane.showMessageDialog(null, "SQLState: " + sqlE.getSQLState() + "\nErrorCode: " + sqlE.getErrorCode() +
                    "\nErrorMessage: " + sqlE.getMessage() + "\nExceptionType: SQLException" +
                    "\nVerbindung zur Datenbank konnte nicht hergestellt werden!", "Fehler beim Laden der Datenbank", JOptionPane.ERROR_MESSAGE);
            this.closeConnection();
        }
    }

    public void addDetailMap(String paramName, String paramUrl, String paramPos)
    {
        try(Statement stmt = this.connection.createStatement())
        {
            stmt.executeQuery("CREATE TABLE IF NOT EXISTS detailMap (name VARCHAR(30), url VARCHAR(70), position VARCHAR(10 0), PRIMARY KEY(name))");
            stmt.executeQuery("INSERT INTO detailMap VALUES('" + paramName + "', '" + paramUrl + "', '" + paramPos + "')");
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("detailMap hinzugefügt.\n");
        }
        catch(SQLException sqlE)
        {
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Fehler beim Hinzufügen von detailMap!\n");
        }
    }

    public void addCharakter(int mut, int klugheit, int intuition, int charisma, int fingerfertigkeit, int gewandheit, int koerperkraft, int lebensPkte, int astralPkte, int aberglaube,
            int koerperbeherrschung, int selbstbeherrschung, int aexteBeile, int dolche, int schwertSblEh, int schwertSblZh, int fechtwaffen, int speerStab, int stumpfEh, int stumpfZh,
            int armbrust, int bogen, String namensListe, String klasse, String kopfEq, String brustEq, String waffenhandEq, String nebenhandEq, String url)
    {
        int stufe = 1;
        int magieresistenz = ((mut + klugheit + stufe)/3)-(2*aberglaube);
        if(magieresistenz < 0)
            magieresistenz = 0;
        //TODO formel zur berechnung der ausdauer (bewegunsreichweite) [rüstungsbehinderung beachten]
        int ausdauer = (lebensPkte + koerperkraft + gewandheit);
        int attackeWert = (mut + gewandheit + koerperkraft)/5;
        int paradeWert = (intuition + gewandheit + koerperkraft)/5;
        int fernkampfWert = (intuition + fingerfertigkeit + koerperkraft)/4;
        int ausweichWert = (mut + intuition + gewandheit)/4;

        try(Statement stmt = this.connection.createStatement())
        {
            stmt.executeQuery("CREATE TABLE IF NOT EXISTS charakterRaw (charID INT IDENTITY, klasse VARCHAR(30),lebensPkte INT, astralPkte INT, mut INT, klugheit INT, intuition INT," +
                    "charisma INT, fingerfertigkeit INT, gewandheit INT, koerperkraft INT, aberglaube INT, koerperbeherrschung INT, selbstbeherrschung INT, aexteBeile INT, dolche INT," +
                    "schwertSblEh INT, schwertSblZh INT, fechtwaffen INT, speerStab INT, stumpfEh INT, stumpfZh INT, armbrust INT, bogen INT, stufe INT, magieresistenz INT," +
                    "ausdauer INT, attackeWert INT, paradeWert INT, fernkampfWert INT, ausweichWert INT, waffenhandEq VARCHAR(40), nebenhandEq VARCHAR(40), kopfEq VARCHAR(40)," +
                    "brustEq VARCHAR(40), namensListe VARCHAR(200), url VARCHAR(70))");
            stmt.executeQuery("INSERT INTO charakterRaw VALUES(" + mut + "," + klugheit + "," + intuition + "," + charisma +"," + fingerfertigkeit + "," + gewandheit + "," + koerperkraft + "," +
                    "" + lebensPkte + "," + astralPkte + "," + aberglaube + "," + koerperbeherrschung + "," + selbstbeherrschung + "," + aexteBeile + "," +
                    "" + dolche + "," + schwertSblEh + "," + schwertSblZh + "," + fechtwaffen + "," + speerStab + "," + stumpfEh + "," + stumpfZh + "," +
                    "" + armbrust + "," + bogen + ",'" + namensListe + "','" + klasse + "','" + kopfEq + "','" + brustEq + "','" + waffenhandEq + "','" + url + "','" +
                    "" + nebenhandEq + "'," + stufe + "," + magieresistenz + "," + ausdauer + "," + attackeWert + "," + paradeWert + "," + fernkampfWert + "," + ausweichWert + ")");
            this.programController.getCharacterController().getCharacterView().getTxtAKonsole().append("charakter hinzugefügt.\n");
        }
        catch(SQLException e)
        {
            this.programController.getCharacterController().getCharacterView().getTxtAKonsole().append("Fehler beim Hinzufügen von charakter!\n");
        }

    }

    public void closeConnection()
    {
        try
        {
            if(this.connection != null)
            {
                this.connection.close();
                System.out.println("HSQLDB getrennt!");
            }
            else
                System.out.println("Connection nicht gefunden oder nicht vorhanden!");
            System.exit(0);
        }
        catch(SQLException sqlE)
        {
            System.out.println("Fehler beim Schließen der connection!");
            System.exit(-1);
        }
    }
}
