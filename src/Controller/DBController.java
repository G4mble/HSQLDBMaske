package Controller;

import java.sql.*;

public class DBController
{
    private Connection connection = null;
    private ProgramController programController;

    public DBController(ProgramController paramProgramController)
    {
        this.programController = paramProgramController;
        try
        {
            Class.forName("org.hsqldb.jdbcDriver");
            System.out.println("Treiberklasse geladen.");
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Treiberklasse nicht gefunden!");
            return;
        }

        try
        {
            this.connection = DriverManager.getConnection("jdbc:hsqldb:file:C:\\Users\\Tommy\\IdeaProjects\\HSQLDBMaske\\data\\db", "root", "");
            System.out.println("HSQLDB verbunden.");
        }
        catch(SQLException e)
        {
            System.err.println("Fehler beim Verbindungsaufbau!");
        }
    }

    public void addDetailMap(String paramName, String paramUrl, String paramPos)
    {
        try
        {
            Statement stmt = this.connection.createStatement();
            stmt.executeQuery("CREATE TABLE IF NOT EXISTS detailMap (name VARCHAR(1000), url VARCHAR(1000), position VARCHAR(1000), PRIMARY KEY(name))");
            stmt.executeQuery("INSERT INTO detailMap(name, url, position) VALUES('" + paramName + "'), ('" + paramUrl + "'), ('" + paramPos + "')");
            stmt.close();
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Neue detailMap hinzugefügt.\n");
        }
        catch(SQLException sqlE)
        {
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Fehler bei Hinzufügen von detailMap!\n");
        }
    }

    public void addCharakter(int mut, int klugheit, int intuition, int charisma, int fingerfertigkeit, int gewandheit, int koerperkraft, int lebensPkte, int astralPkte, int aberglaube,
            int koerperbeherrschung, int selbstbeherrschung, int aexteBeile, int dolche, int schwertSblEh, int schwertSblZh, int fechtwaffen, int speerStab, int stumpfEh, int stumpfZh,
            int armbrust, int bogen, String namensListe, String klasse, String kopfEq, String brustEq, String waffenhandEq, String nebenhandEq)
    {
        /**setze stufe auf 1*/
        int stufe = 1;
        /**werte berechnen*/
        int magieresistenz = ((mut + klugheit + stufe)/3)-(2*aberglaube);
        //TODO formel zur berechnung der ausdauer (bewegunsreichweite) [rüstungsbehunderung beachten]
        int ausdauer = (lebensPkte + koerperkraft + gewandheit);
        int attackeWert = (mut + gewandheit + koerperkraft)/5;
        int paradeWert = (intuition + gewandheit + koerperkraft)/5;
        int fernkampfWert = (intuition + fingerfertigkeit + koerperkraft)/4;
        int ausweichWert = (mut + intuition + gewandheit)/4;
    }

    public Connection getConnection()
    {
        return this.connection;
    }
}
