package Controller;

import View.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        switch(e.getActionCommand())
        {
            case "detailMap":
                this.detailMap();
                break;
            case "charakter":
                this.charakter();
                break;
            case "waffe":
                this.waffe();
                break;
            case "beenden":
                this.dbController.closeConnection();
                break;
        }
        this.menuView.dispose();
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
