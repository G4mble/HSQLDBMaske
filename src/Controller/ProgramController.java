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
        else if(e.getActionCommand().equals("kreatur"))
        {
            this.kreatur();
            this.menuView.dispose();
        }
        else if(e.getActionCommand().equals("beenden"))
        {
            System.exit(0);
            if(this.dbController.getConnection() != null)
            {
                try
                {
                    this.dbController.getConnection().close();
                }
                catch(SQLException sqlE)
                {
                    System.err.println("Fehler beim Schließen der Verbindung");
                }
            }
        }
    }

    public void detailMap()
    {
        this.detailMapController = new DetailMapController(this);
        this.dbController = new DBController(this);
    }

    public void charakter()
    {
        this.characterController = new CharacterController(this);
    }

    public void kreatur()
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
