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
        switch(e.getActionCommand())
        {
            case "add":
                this.addElement();
                break;
            case "reset":
                this.resetView();
                break;
            case "back":
                this.characterView.dispose();
                this.programController.backToMenu();
                break;
        }
    }

    public void resetView()
    {
        this.characterView.dispose();
        this.characterView = new CharacterView(this);
    }

    public void addElement()
    {
        int lebensPkte = Integer.parseInt(this.characterView.getLebenspunkte().toString());
        int astralPkte = Integer.parseInt(this.characterView.getAstralpunkte().toString());
        String namensListe = this.characterView.getCharName();
        String klasse = this.characterView.getKlasse();
        String kopfEq = this.characterView.getKopf();
        String brustEq = this.characterView.getBrust();
        String waffenhandEq = this.characterView.getWaffenhand();
        String nebenhandEq = this.characterView.getNebenhand();
        String url = "data\\img\\tiles\\char\\" + this.characterView.getUrl() + ".png";
        int mut = Integer.parseInt(this.characterView.getMut().toString());
        int klugheit = Integer.parseInt(this.characterView.getKlugheit().toString());
        int intuition = Integer.parseInt(this.characterView.getIntuition().toString());
        int charisma = Integer.parseInt(this.characterView.getCharisma().toString());
        int fingerfertigkeit = Integer.parseInt(this.characterView.getFingerfertigkeit().toString());
        int gewandheit = Integer.parseInt(this.characterView.getGewandheit().toString());
        int koerperkraft = Integer.parseInt(this.characterView.getKoerperkraft().toString());
        int aberglaube = Integer.parseInt(this.characterView.getAberglaube().toString());
        int koerperbeherrschung = Integer.parseInt(this.characterView.getKoerperbeherrschung().toString());
        int selbstbeherrschung = Integer.parseInt(this.characterView.getSelbstbeherrschung().toString());
        int aexteBeile = Integer.parseInt(this.characterView.getAexteBeile().toString());
        int dolche = Integer.parseInt(this.characterView.getDolche().toString());
        int schwertSblEh = Integer.parseInt(this.characterView.getSchwertSblEh().toString());
        int schwertSblZh = Integer.parseInt(this.characterView.getSchwertSblZh().toString());
        int fechtwaffen = Integer.parseInt(this.characterView.getFechtwaffen().toString());
        int speerStab = Integer.parseInt(this.characterView.getSpeerStab().toString());
        int stumpfEh = Integer.parseInt(this.characterView.getStumpfEh().toString());
        int stumpfZh = Integer.parseInt(this.characterView.getStumpfZh().toString());
        int armbrust = Integer.parseInt(this.characterView.getArmbrust().toString());
        int bogen = Integer.parseInt(this.characterView.getBogen().toString());

        this.characterView.continueAfterInsert(this.programController.getDbController().addCharakter(mut, klugheit, intuition, charisma, fingerfertigkeit, gewandheit, koerperkraft, lebensPkte, astralPkte, aberglaube,
                koerperbeherrschung, selbstbeherrschung, aexteBeile, dolche, schwertSblEh, schwertSblZh, fechtwaffen, speerStab, stumpfEh, stumpfZh, armbrust, bogen, namensListe, klasse,
                kopfEq, brustEq, waffenhandEq, nebenhandEq, url));
    }
}
