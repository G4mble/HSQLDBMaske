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
        int lebensPkte = Integer.parseInt(this.characterView.getSpinnerLebenspunkte().getValue().toString());
        int astralPkte = Integer.parseInt(this.characterView.getSpinnerAstralpunkte().getValue().toString());
        String namensListe = this.characterView.getTxtAName().getText();
        String klasse = this.characterView.getTxtfKlasse().getText();
        String kopfEq = this.characterView.getTxtfKopf().getText();
        String brustEq = this.characterView.getTxtfBrust().getText();
        String waffenhandEq = this.characterView.getTxtfWaffenhand().getText();
        String nebenhandEq = this.characterView.getTxtfNebenhand().getText();
        int mut = Integer.parseInt(this.characterView.getSpinnerMut().getValue().toString());
        int klugheit = Integer.parseInt(this.characterView.getSpinnerKlugheit().getValue().toString());
        int intuition = Integer.parseInt(this.characterView.getSpinnerIntuition().getValue().toString());
        int charisma = Integer.parseInt(this.characterView.getSpinnerCharisma().getValue().toString());
        int fingerfertigkeit = Integer.parseInt(this.characterView.getSpinnerFingerfertigkeit().getValue().toString());
        int gewandheit = Integer.parseInt(this.characterView.getSpinnerGewandheit().getValue().toString());
        int koerperkraft = Integer.parseInt(this.characterView.getSpinnerKoerperkraft().getValue().toString());
        int aberglaube = Integer.parseInt(this.characterView.getSpinnerAberglaube().getValue().toString());
        int koerperbeherrschung = Integer.parseInt(this.characterView.getSpinnerKoerperbeherrschung().getValue().toString());
        int selbstbeherrschung = Integer.parseInt(this.characterView.getSpinnerSelbstbeherrschung().getValue().toString());
        int aexteBeile = Integer.parseInt(this.characterView.getSpinnerAexteBeile().getValue().toString());
        int dolche = Integer.parseInt(this.characterView.getSpinnerDolche().getValue().toString());
        int schwertSblEh = Integer.parseInt(this.characterView.getSpinnerSchwertSblEh().getValue().toString());
        int schwertSblZh = Integer.parseInt(this.characterView.getSpinnerSchwertSblZh().getValue().toString());
        int fechtwaffen = Integer.parseInt(this.characterView.getSpinnerFechtwaffen().getValue().toString());
        int speerStab = Integer.parseInt(this.characterView.getSpinnerSpeerStab().getValue().toString());
        int stumpfEh = Integer.parseInt(this.characterView.getSpinnerStumpfEh().getValue().toString());
        int stumpfZh = Integer.parseInt(this.characterView.getSpinnerStumpfZh().getValue().toString());
        int armbrust = Integer.parseInt(this.characterView.getSpinnerArmbrust().getValue().toString());
        int bogen = Integer.parseInt(this.characterView.getSpinnerBogen().getValue().toString());

        this.programController.getDbController().addCharakter(mut, klugheit, intuition, charisma, fingerfertigkeit, gewandheit, koerperkraft, lebensPkte, astralPkte, aberglaube,
                koerperbeherrschung, selbstbeherrschung, aexteBeile, dolche, schwertSblEh, schwertSblZh, fechtwaffen, speerStab, stumpfEh, stumpfZh, armbrust, bogen, namensListe, klasse,
                kopfEq, brustEq, waffenhandEq, nebenhandEq);
    }
}
