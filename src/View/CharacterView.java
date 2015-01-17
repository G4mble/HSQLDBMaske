package View;

import Controller.CharacterController;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class CharacterView extends JFrame
{
    private JTextField txtfKlasse, txtfKopf, txtfBrust, txtfWaffenhand, txtfNebenhand, txtfUrl;
    private JSpinner spinnerAberglaube, spinnerLebenspunkte, spinnerAstralpunkte, spinnerMut, spinnerKlugheit, spinnerIntuition, spinnerCharisma, spinnerFingerfertigkeit, spinnerGewandheit,
    spinnerKoerperkraft, spinnerKoerperbeherrschung, spinnerSelbstbeherrschung, spinnerAexteBeile, spinnerFechtwaffen, spinnerDolche, spinnerArmbrust, spinnerBogen, spinnerSchwertSblEh,
    spinnerSchwertSblZh, spinnerStumpfEh, spinnerStumpfZh, spinnerSpeerStab;
    private JTextArea txtAName, txtAKonsole;

    public CharacterView(CharacterController paramCharacterController)
    {
/**Buttons*/

        JButton btnReset = new JButton("reset");
        btnReset.setBounds(138, 514, 89, 23);
        btnReset.addActionListener(paramCharacterController);
        btnReset.setActionCommand("reset");
        getContentPane().add(btnReset);

        JButton btnBack = new JButton("back");
        btnBack.setBounds(14, 514, 89, 23);
        btnBack.addActionListener(paramCharacterController);
        btnBack.setActionCommand("back");
        getContentPane().add(btnBack);

        JButton btnAdd = new JButton("add");
        btnAdd.setBounds(270, 514, 89, 23);
        btnAdd.addActionListener(paramCharacterController);
        btnAdd.setActionCommand("add");
        getContentPane().add(btnAdd);

/**Spinner*/

        this.spinnerLebenspunkte = new JSpinner();
        this.spinnerLebenspunkte.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        this.spinnerLebenspunkte.setBounds(46, 42, 40, 20);
        this.spinnerLebenspunkte.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerLebenspunkte);

        this.spinnerAstralpunkte = new JSpinner();
        this.spinnerAstralpunkte.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        this.spinnerAstralpunkte.setBounds(136, 42, 40, 20);
        this.spinnerAstralpunkte.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerAstralpunkte);

        this.spinnerMut = new JSpinner();
        this.spinnerMut.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerMut.setBounds(46, 85, 40, 20);
        this.spinnerMut.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerMut);

        this.spinnerKlugheit = new JSpinner();
        this.spinnerKlugheit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerKlugheit.setBounds(136, 85, 40, 20);
        this.spinnerKlugheit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerKlugheit);

        this.spinnerIntuition = new JSpinner();
        this.spinnerIntuition.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerIntuition.setBounds(46, 116, 40, 20);
        this.spinnerIntuition.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerIntuition);

        this.spinnerCharisma = new JSpinner();
        this.spinnerCharisma.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerCharisma.setBounds(136, 116, 40, 20);
        this.spinnerCharisma.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerCharisma);

        this.spinnerFingerfertigkeit = new JSpinner();
        this.spinnerFingerfertigkeit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerFingerfertigkeit.setBounds(46, 147, 40, 20);
        this.spinnerFingerfertigkeit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerFingerfertigkeit);

        this.spinnerGewandheit = new JSpinner();
        this.spinnerGewandheit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerGewandheit.setBounds(136, 147, 40, 20);
        this.spinnerGewandheit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerGewandheit);

        this.spinnerKoerperkraft = new JSpinner();
        this.spinnerKoerperkraft.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerKoerperkraft.setBounds(46, 178, 40, 20);
        this.spinnerKoerperkraft.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerKoerperkraft);

        this.spinnerAberglaube = new JSpinner();
        this.spinnerAberglaube.setBounds(136, 178, 40, 20);
        this.spinnerAberglaube.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        this.spinnerAberglaube.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerAberglaube);

        this.spinnerKoerperbeherrschung = new JSpinner();
        this.spinnerKoerperbeherrschung.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerKoerperbeherrschung.setBounds(46, 206, 40, 20);
        this.spinnerKoerperbeherrschung.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerKoerperbeherrschung);

        this.spinnerSelbstbeherrschung = new JSpinner();
        this.spinnerSelbstbeherrschung.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerSelbstbeherrschung.setBounds(136, 206, 40, 20);
        this.spinnerSelbstbeherrschung.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerSelbstbeherrschung);

        this.spinnerAexteBeile = new JSpinner();
        this.spinnerAexteBeile.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerAexteBeile.setBounds(105, 244, 40, 20);
        this.spinnerAexteBeile.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerAexteBeile);

        this.spinnerFechtwaffen = new JSpinner();
        this.spinnerFechtwaffen.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerFechtwaffen.setBounds(105, 272, 40, 20);
        this.spinnerFechtwaffen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerFechtwaffen);

        this.spinnerDolche = new JSpinner();
        this.spinnerDolche.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerDolche.setBounds(105, 300, 40, 20);
        this.spinnerDolche.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerDolche);

        this.spinnerArmbrust = new JSpinner();
        this.spinnerArmbrust.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerArmbrust.setBounds(105, 328, 40, 20);
        this.spinnerArmbrust.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerArmbrust);

        this.spinnerBogen = new JSpinner();
        this.spinnerBogen.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerBogen.setBounds(105, 356, 40, 20);
        this.spinnerBogen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerBogen);

        this.spinnerSchwertSblEh = new JSpinner();
        this.spinnerSchwertSblEh.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerSchwertSblEh.setBounds(317, 244, 40, 20);
        this.spinnerSchwertSblEh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerSchwertSblEh);

        this.spinnerSchwertSblZh = new JSpinner();
        this.spinnerSchwertSblZh.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerSchwertSblZh.setBounds(317, 272, 40, 20);
        this.spinnerSchwertSblZh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerSchwertSblZh);

        this.spinnerStumpfEh = new JSpinner();
        this.spinnerStumpfEh.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerStumpfEh.setBounds(317, 300, 40, 20);
        this.spinnerStumpfEh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerStumpfEh);

        this.spinnerStumpfZh = new JSpinner();
        this.spinnerStumpfZh.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerStumpfZh.setBounds(317, 328, 40, 20);
        this.spinnerStumpfZh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerStumpfZh);

        this.spinnerSpeerStab = new JSpinner();
        this.spinnerSpeerStab.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        this.spinnerSpeerStab.setBounds(317, 356, 40, 20);
        this.spinnerSpeerStab.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerSpeerStab);

/**TextArea*/

        this.txtAName = new JTextArea();
        this.txtAName.setBounds(212, 40, 145, 183);
        this.txtAName.setLineWrap(true);
        this.txtAName.setWrapStyleWord(true);
        this.txtAName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtAName);

        this.txtAKonsole = new JTextArea();
        this.txtAKonsole.setBounds(14, 558, 345, 74);
        this.txtAKonsole.setEditable(false);
        this.txtAKonsole.setLineWrap(true);
        this.txtAKonsole.setWrapStyleWord(true);
        this.txtAKonsole.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtAKonsole);

/**TextField*/

        this.txtfKopf = new JTextField();
        this.txtfKopf.setBounds(66, 395, 86, 20);
        this.txtfKopf.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfKopf);

        this.txtfBrust = new JTextField();
        this.txtfBrust.setBounds(66, 426, 86, 20);
        this.txtfBrust.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfBrust);

        this.txtfWaffenhand = new JTextField();
        this.txtfWaffenhand.setBounds(263, 395, 86, 20);
        this.txtfWaffenhand.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfWaffenhand);

        this.txtfNebenhand = new JTextField();
        this.txtfNebenhand.setBounds(263, 426, 86, 20);
        this.txtfNebenhand.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfNebenhand);

        this.txtfKlasse = new JTextField();
        this.txtfKlasse.setBounds(66, 11, 110, 20);
        this.txtfKlasse.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfKlasse);

        this.txtfUrl = new JTextField();
        this.txtfUrl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        this.txtfUrl.setBounds(66, 470, 86, 20);
        getContentPane().add(txtfUrl);

/**Label*/

        JLabel lblKlasse = new JLabel("Klasse:");
        lblKlasse.setBounds(12, 14, 46, 14);
        getContentPane().add(lblKlasse);

        JLabel lblLebenspunkte = new JLabel("LeP:");
        lblLebenspunkte.setBounds(12, 45, 36, 14);
        getContentPane().add(lblLebenspunkte);

        JLabel lblAstralpunkte = new JLabel("AsP:");
        lblAstralpunkte.setBounds(96, 45, 30, 14);
        getContentPane().add(lblAstralpunkte);

        JLabel lblMut = new JLabel("MU:");
        lblMut.setBounds(10, 88, 46, 14);
        getContentPane().add(lblMut);

        JLabel lblKlugheit = new JLabel("KL:");
        lblKlugheit.setBounds(96, 88, 30, 14);
        getContentPane().add(lblKlugheit);

        JLabel lblIntuition = new JLabel("IN:");
        lblIntuition.setBounds(12, 119, 30, 14);
        getContentPane().add(lblIntuition);

        JLabel lblCharisma = new JLabel("CH:");
        lblCharisma.setBounds(96, 119, 30, 14);
        getContentPane().add(lblCharisma);

        JLabel lblFingerfertigkeit = new JLabel("FF:");
        lblFingerfertigkeit.setBounds(12, 150, 30, 14);
        getContentPane().add(lblFingerfertigkeit);

        JLabel lblGewandheit = new JLabel("GE:");
        lblGewandheit.setBounds(96, 150, 30, 14);
        getContentPane().add(lblGewandheit);

        JLabel lblKrperkraft = new JLabel("KK:");
        lblKrperkraft.setBounds(12, 181, 30, 14);
        getContentPane().add(lblKrperkraft);

        JLabel lblAbeerglauber = new JLabel("AG:");
        lblAbeerglauber.setBounds(96, 181, 30, 14);
        getContentPane().add(lblAbeerglauber);

        JLabel lblKoerperbeherrschung = new JLabel("KB:");
        lblKoerperbeherrschung.setBounds(12, 209, 30, 14);
        getContentPane().add(lblKoerperbeherrschung);

        JLabel lblSelbstbeherrschung = new JLabel("SB:");
        lblSelbstbeherrschung.setBounds(96, 209, 30, 14);
        getContentPane().add(lblSelbstbeherrschung);

        JLabel lblWaffenhand = new JLabel("Waffenhand:");
        lblWaffenhand.setBounds(179, 398, 89, 14);
        getContentPane().add(lblWaffenhand);

        JLabel lblNebenhand = new JLabel("Nebenhand:");
        lblNebenhand.setBounds(179, 429, 79, 14);
        getContentPane().add(lblNebenhand);

        JLabel lblKopf = new JLabel("Kopf:");
        lblKopf.setBounds(12, 398, 46, 14);
        getContentPane().add(lblKopf);

        JLabel lblBrust = new JLabel("Brust:");
        lblBrust.setBounds(12, 429, 46, 14);
        getContentPane().add(lblBrust);

        JLabel lblAexteUndBeile = new JLabel("\u00C4xte und Beile:");
        lblAexteUndBeile.setBounds(12, 247, 98, 14);
        getContentPane().add(lblAexteUndBeile);

        JLabel lblDolche = new JLabel("Dolche:");
        lblDolche.setBounds(12, 303, 46, 14);
        getContentPane().add(lblDolche);

        JLabel lblSchwerterUndSbeleh = new JLabel("Schwerter und S\u00E4bel(EH):");
        lblSchwerterUndSbeleh.setBounds(164, 247, 153, 14);
        getContentPane().add(lblSchwerterUndSbeleh);

        JLabel lblSchwerterUndSbelzh = new JLabel("Schwerter und S\u00E4bel(ZH):");
        lblSchwerterUndSbelzh.setBounds(164, 275, 153, 14);
        getContentPane().add(lblSchwerterUndSbelzh);

        JLabel lblFechtwaffen = new JLabel("Fechtwaffen:");
        lblFechtwaffen.setBounds(12, 275, 74, 14);
        getContentPane().add(lblFechtwaffen);

        JLabel lblSpeereUndStbe = new JLabel("Speere und St\u00E4be:");
        lblSpeereUndStbe.setBounds(164, 359, 105, 14);
        getContentPane().add(lblSpeereUndStbe);

        JLabel lblStumpfeHiebwaffeneh = new JLabel("Stumpfe Hiebwaffen(EH):");
        lblStumpfeHiebwaffeneh.setBounds(164, 303, 141, 14);
        getContentPane().add(lblStumpfeHiebwaffeneh);

        JLabel lblStumpfeHiebwaffenzh = new JLabel("Stumpfe Hiebwaffen(ZH):");
        lblStumpfeHiebwaffenzh.setBounds(164, 331, 141, 14);
        getContentPane().add(lblStumpfeHiebwaffenzh);

        JLabel lblArmbrust = new JLabel("Armbrust:");
        lblArmbrust.setBounds(12, 331, 66, 14);
        getContentPane().add(lblArmbrust);

        JLabel lblBogen = new JLabel("Bogen:");
        lblBogen.setBounds(12, 359, 46, 14);
        getContentPane().add(lblBogen);

        JLabel lblNamen = new JLabel("Namen:");
        lblNamen.setBounds(212, 14, 56, 14);
        getContentPane().add(lblNamen);

        JLabel lblUrl = new JLabel("URL:");
        lblUrl.setBounds(14, 473, 36, 14);
        getContentPane().add(lblUrl);

/**Separator*/

        JSeparator separator_7 = new JSeparator();
        separator_7.setBounds(10, 387, 355, 14);
        getContentPane().add(separator_7);

        JSeparator separator_4 = new JSeparator();
        separator_4.setBounds(10, 201, 175, 7);
        getContentPane().add(separator_4);

        JSeparator separator_5 = new JSeparator();
        separator_5.setOrientation(SwingConstants.VERTICAL);
        separator_5.setBounds(90, 173, 11, 25);
        getContentPane().add(separator_5);

        JSeparator separator_6 = new JSeparator();
        separator_6.setBounds(95, 172, 90, 14);
        getContentPane().add(separator_6);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(10, 233, 355, 14);
        getContentPane().add(separator_2);

        JSeparator separator_1 = new JSeparator();
        separator_1.setOrientation(SwingConstants.VERTICAL);
        separator_1.setBounds(195, 11, 11, 212);
        getContentPane().add(separator_1);

        JSeparator separator = new JSeparator();
        separator.setBorder(null);
        separator.setBounds(10, 73, 175, 20);
        getContentPane().add(separator);

        JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(12, 548, 355, 20);
        getContentPane().add(separator_3);

        JSeparator separator_8 = new JSeparator();
        separator_8.setBounds(10, 457, 355, 14);
        getContentPane().add(separator_8);

/**Properties*/

        this.setSize(new Dimension(380, 675));
        this.getContentPane().setLayout(null);
        this.setTitle("charakter_template");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void continueAfterInsert(boolean tmpState)
    {
        String message;
        if(tmpState)
            message = "Charakter erfolgreich hinzugefügt!";
        else
            message = "Fehler beim Hinzufügen von Charakter!";
        this.txtAKonsole.setText(message);
    }

    public String getKlasse()
    {
        return this.txtfKlasse.getText();
    }

    public String getKopf()
    {
        return this.txtfKopf.getText();
    }

    public String getBrust()
    {
        return this.txtfBrust.getText();
    }

    public String getWaffenhand()
    {
        return this.txtfWaffenhand.getText();
    }

    public String getNebenhand()
    {
        return this.txtfNebenhand.getText();
    }

    public String getUrl()
    {
        return this.txtfUrl.getText();
    }

    public String getCharName()
    {
        return this.txtAName.getText();
    }

    public Object getLebenspunkte()
    {
        return this.spinnerLebenspunkte.getValue();
    }

    public Object getAstralpunkte()
    {
        return this.spinnerAstralpunkte.getValue();
    }

    public Object getMut()
    {
        return this.spinnerMut.getValue();
    }

    public Object getKlugheit()
    {
        return this.spinnerKlugheit.getValue();
    }

    public Object getIntuition()
    {
        return this.spinnerIntuition.getValue();
    }

    public Object getCharisma()
    {
        return this.spinnerCharisma.getValue();
    }

    public Object getFingerfertigkeit()
    {
        return this.spinnerFingerfertigkeit.getValue();
    }

    public Object getGewandheit()
    {
        return this.spinnerGewandheit.getValue();
    }

    public Object getKoerperkraft()
    {
        return this.spinnerKoerperkraft.getValue();
    }

    public Object getKoerperbeherrschung()
    {
        return this.spinnerKoerperbeherrschung.getValue();
    }

    public Object getSelbstbeherrschung()
    {
        return this.spinnerSelbstbeherrschung.getValue();
    }

    public Object getAexteBeile()
    {
        return this.spinnerAexteBeile.getValue();
    }

    public Object getFechtwaffen()
    {
        return this.spinnerFechtwaffen.getValue();
    }

    public Object getDolche()
    {
        return this.spinnerDolche.getValue();
    }

    public Object getArmbrust()
    {
        return this.spinnerArmbrust.getValue();
    }

    public Object getBogen()
    {
        return this.spinnerBogen.getValue();
    }

    public Object getSchwertSblEh()
    {
        return this.spinnerSchwertSblEh.getValue();
    }

    public Object getSchwertSblZh()
    {
        return this.spinnerSchwertSblZh.getValue();
    }

    public Object getStumpfEh()
    {
        return this.spinnerStumpfEh.getValue();
    }

    public Object getStumpfZh()
    {
        return this.spinnerStumpfZh.getValue();
    }

    public Object getSpeerStab()
    {
        return this.spinnerSpeerStab.getValue();
    }

    public Object getAberglaube()
    {
        return this.spinnerAberglaube.getValue();
    }
}