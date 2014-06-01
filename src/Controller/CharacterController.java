package Controller;

import View.CharacterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterController implements ActionListener
{
    private ProgramController programController;
    private CharacterView characterView;

    public CharacterController(ProgramController paramProgramController)
    {
        this.programController = paramProgramController;
        this.characterView = new CharacterView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("add"))
            this.addElement();
        else if(e.getActionCommand().equals("reset"))
            this.resetView();
        else if(e.getActionCommand().equals("back"))
        {
            this.programController.backToMenu();
            this.characterView.dispose();
        }
    }

    public void resetView()
    {
        this.characterView.dispose();
        this.characterView = new CharacterView(this);
    }

    public void addElement()
    {
    }
}
