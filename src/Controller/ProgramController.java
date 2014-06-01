package Controller;

import View.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ProgramController implements ActionListener
{
    private MenuView menuView;
    private DetailMapController detailMapController;
    private DBController dbController;
    private CharacterController characterController;

    public ProgramController()
    {
        this.dbController = new DBController(this);
        this.menuView = new MenuView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("detailMap"))
        {
            this.detailMap();
            this.menuView.dispose();
        }
        else if(e.getActionCommand().equals("charakter"))
        {
            this.charakter();
            this.menuView.dispose();
        }
        else if(e.getActionCommand().equals("waffe"))
        {
            this.waffe();
            this.menuView.dispose();
        }
        else if(e.getActionCommand().equals("beenden"))
        {
            if(this.dbController.getConnection() != null)
            {
                try
                {
                    this.dbController.getConnection().close();
                    System.out.println("HSQLDB getrennt.");
                }
                catch(SQLException sqlE)
                {
                    System.err.println("Fehler beim Trennen der HSQLDB-Verbindung!");
                }
            }
            System.exit(0);
        }
    }

    public void detailMap()
    {
        this.detailMapController = new DetailMapController(this);
    }

    public void charakter()
    {
        this.characterController = new CharacterController(this);
    }

    public void waffe()
    {
    }

    public void backToMenu()
    {
        this.menuView = new MenuView(this);
    }

    public DetailMapController getDetailMapController()
    {
        return this.detailMapController;
    }

    public CharacterController getCharacterController()
    {
        return this.characterController;
    }

    public DBController getDbController()
    {
        return this.dbController;
    }
}
