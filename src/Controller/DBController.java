package Controller;

import java.sql.*;

public class DBController
{
    private Connection connection = null;
    private ProgramController programController;

    //TODO empty all catchblocks

    public DBController(ProgramController paramProgramController)
    {
        this.programController = paramProgramController;
        try
        {
            // Treiberklasse laden
            Class.forName( "org.hsqldb.jdbcDriver" );
        }
        catch (ClassNotFoundException e)
        {
            System.err.println( "Treiberklasse nicht gefunden!" );
            return;
        }

        try
        {
            this.connection = DriverManager.getConnection("jdbc:hsqldb:file:C:\\Users\\Tommy\\IdeaProjects\\XMLEingabeMaske\\data\\db\\rpgDB", "root", "");
        }
        catch (SQLException e)
        {
            System.err.println("Fehler beim Verbindungsaufbau");
        }
    }

    public void addDetailMap(String paramName, String paramUrl, String paramPos, int paramPosCount)
    {
        try
        {
            Statement stmt = this.connection.createStatement();
            stmt.executeQuery("CREATE TABLE IF NOT EXISTS detailMap (name VARCHAR(1000), url VARCHAR(1000), position VARCHAR(1000), positionCount INTEGER, PRIMARY KEY(name))");
            stmt.executeQuery("INSERT INTO detailMap(name, url, position, positionCount) VALUES('" + paramName + "'), ('" + paramUrl + "'), ('" + paramPos + "'), (" + paramPosCount + ")");
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Neue map hinzugefügt.\n");
        }
        catch(SQLException sqlE)
        {
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Fehler bei hinzufügen von map.\n");
        }
    }
}
