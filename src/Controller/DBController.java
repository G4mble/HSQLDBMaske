package Controller;

import javax.swing.*;
import java.sql.*;

public class DBController
{
    private Connection connection = null;
    private static DBController currentDBController = null;

    /**Lädt Treiberklasse
    * baut Verbindung zur DB auf
    * err.prinln sonst*/
    private DBController()
    {
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

    /**Gibt das aktuelle DBController Objekt zurück
     * Erzeugt neuen DBController wenn currentDBController == null*/
    public static DBController getInstance()
    {
        if(currentDBController == null)
            currentDBController = new DBController();
        return currentDBController;
    }

    public boolean addDetailMap(String paramName, String paramUrl, String paramPos)
    {
        try(Statement stmt = this.connection.createStatement())
        {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS detailMap (name VARCHAR(30), url VARCHAR(70), position VARCHAR(10 0), PRIMARY KEY(name))");
            stmt.executeUpdate("INSERT INTO detailMap VALUES('" + paramName + "', '" + paramUrl + "', '" + paramPos + "')");
            return true;
        }
        catch(SQLException sqlE)
        {
            return false;
        }
    }

    public boolean addCharakter(int mut, int klugheit, int intuition, int charisma, int fingerfertigkeit, int gewandheit, int koerperkraft, int lebensPkte, int astralPkte, int aberglaube,
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
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS charakterRaw (charID INT IDENTITY, klasse VARCHAR(30),lebensPkte INT, astralPkte INT, mut INT, klugheit INT, intuition INT," +
                    "charisma INT, fingerfertigkeit INT, gewandheit INT, koerperkraft INT, aberglaube INT, koerperbeherrschung INT, selbstbeherrschung INT, aexteBeile INT, dolche INT," +
                    "schwertSblEh INT, schwertSblZh INT, fechtwaffen INT, speerStab INT, stumpfEh INT, stumpfZh INT, armbrust INT, bogen INT, stufe INT, magieresistenz INT," +
                    "ausdauer INT, attackeWert INT, paradeWert INT, fernkampfWert INT, ausweichWert INT, waffenhandEq VARCHAR(40), nebenhandEq VARCHAR(40), kopfEq VARCHAR(40)," +
                    "brustEq VARCHAR(40), namensListe VARCHAR(200), url VARCHAR(70))");
            stmt.executeUpdate("INSERT INTO charakterRaw VALUES(" + mut + "," + klugheit + "," + intuition + "," + charisma + "," + fingerfertigkeit + "," + gewandheit + "," + koerperkraft + "," +
                    "" + lebensPkte + "," + astralPkte + "," + aberglaube + "," + koerperbeherrschung + "," + selbstbeherrschung + "," + aexteBeile + "," +
                    "" + dolche + "," + schwertSblEh + "," + schwertSblZh + "," + fechtwaffen + "," + speerStab + "," + stumpfEh + "," + stumpfZh + "," +
                    "" + armbrust + "," + bogen + ",'" + namensListe + "','" + klasse + "','" + kopfEq + "','" + brustEq + "','" + waffenhandEq + "','" + url + "','" +
                    "" + nebenhandEq + "'," + stufe + "," + magieresistenz + "," + ausdauer + "," + attackeWert + "," + paradeWert + "," + fernkampfWert + "," + ausweichWert + ")");
            return true;
        }
        catch(SQLException e)
        {
           return false;
        }

    }

    public boolean addAttributeTooltip(String paramName, String paramText)
    {
        try(Statement stmt = this.connection.createStatement())
        {
            stmt.executeUpdate("INSERT INTO attributeTooltip VALUES('" + paramName + "','" + paramText + "')");
            return true;
        }
        catch(SQLException sqlE)
        {
            return false;
        }
    }

    public boolean updateAttributeTooltip(String paramName, String paramText)
    {
        try(Statement stmt = this.connection.createStatement())
        {
            stmt.executeUpdate("UPDATE attributeTooltip SET tooltipText = '" + paramText + "' WHERE name = '" + paramName + "'");
            return true;
        }
        catch(SQLException sqlE)
        {
            return false;
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