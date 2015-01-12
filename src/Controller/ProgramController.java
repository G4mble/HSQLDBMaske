package Controller;

import View.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramController implements ActionListener
{
    private MenuView menuView;
    private DBController dbController;

    public ProgramController()
    {
        this.dbController = DBController.getInstance();
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
            case "attributeTooltip":
                this.attributeTooltip();
                break;
            case "beenden":
                this.dbController.closeConnection();
                break;
        }
        this.menuView.dispose();
    }

    public void detailMap()
    {
        new DetailMapController(this);
    }

    public void charakter()
    {
        new CharacterController(this);
    }

    public void waffe()
    {
    }

    public void attributeTooltip()
    {
        new AttributeTooltipController(this);
    }

    public void backToMenu()
    {
        this.menuView = new MenuView(this);
    }

    public DBController getDbController()
    {
        return this.dbController;
    }
}