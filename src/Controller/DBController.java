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
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Treiberklasse nicht gefunden!");
            return;
        }

        try
        {
            this.connection = DriverManager.getConnection("jdbc:hsqldb:file:C:\\Users\\Tommy\\IdeaProjects\\HSQLDBMaske\\data\\db", "root", "");
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Verbindung hergestellt.\n");
        }
        catch(SQLException e)
        {
            System.err.println("Fehler beim Verbindungsaufbau");
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
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Neue map hinzugefügt.\n");
        }
        catch(SQLException sqlE)
        {
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Fehler bei hinzufügen von map.\n");
        }
    }

    public Connection getConnection()
    {
        return this.connection;
    }
}
