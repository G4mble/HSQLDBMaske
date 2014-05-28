package Controller;

import View.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramController implements ActionListener
{
    private MenuView menuView;
    private DetailMapController detailMapController;
    private XMLWriter xmlWriter;
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
            System.exit(0);
    }

    public void detailMap()
    {
        this.detailMapController = new DetailMapController(this);
        this.xmlWriter = new XMLWriter(this, "data//detailMap.xml");
    }

    public void charakter()
    {
        this.characterController = new CharacterController(this);
        this.xmlWriter = new XMLWriter(this);
    }

    public void kreatur()
    {}

    public void backToMenu()
    {
        this.menuView = new MenuView(this);
    }

    public DetailMapController getDetailMapController()
    {
        return this.detailMapController;
    }

    public XMLWriter getXmlWriter()
    {
        return this.xmlWriter;
    }

    public CharacterController getCharacterController()
    {
        return this.characterController;
    }
}
