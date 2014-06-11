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

        spinnerLebenspunkte = new JSpinner();
        spinnerLebenspunkte.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        spinnerLebenspunkte.setBounds(46, 42, 40, 20);
        spinnerLebenspunkte.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerLebenspunkte);

        spinnerAstralpunkte = new JSpinner();
        spinnerAstralpunkte.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        spinnerAstralpunkte.setBounds(136, 42, 40, 20);
        spinnerAstralpunkte.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerAstralpunkte);

        spinnerMut = new JSpinner();
        spinnerMut.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerMut.setBounds(46, 85, 40, 20);
        spinnerMut.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerMut);

        spinnerKlugheit = new JSpinner();
        spinnerKlugheit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerKlugheit.setBounds(136, 85, 40, 20);
        spinnerKlugheit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerKlugheit);

        spinnerIntuition = new JSpinner();
        spinnerIntuition.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerIntuition.setBounds(46, 116, 40, 20);
        spinnerIntuition.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerIntuition);

        spinnerCharisma = new JSpinner();
        spinnerCharisma.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerCharisma.setBounds(136, 116, 40, 20);
        spinnerCharisma.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerCharisma);

        spinnerFingerfertigkeit = new JSpinner();
        spinnerFingerfertigkeit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerFingerfertigkeit.setBounds(46, 147, 40, 20);
        spinnerFingerfertigkeit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerFingerfertigkeit);

        spinnerGewandheit = new JSpinner();
        spinnerGewandheit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerGewandheit.setBounds(136, 147, 40, 20);
        spinnerGewandheit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerGewandheit);

        spinnerKoerperkraft = new JSpinner();
        spinnerKoerperkraft.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerKoerperkraft.setBounds(46, 178, 40, 20);
        spinnerKoerperkraft.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerKoerperkraft);

        spinnerAberglaube = new JSpinner();
        spinnerAberglaube.setBounds(136, 178, 40, 20);
        spinnerAberglaube.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        spinnerAberglaube.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerAberglaube);

        spinnerKoerperbeherrschung = new JSpinner();
        spinnerKoerperbeherrschung.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerKoerperbeherrschung.setBounds(46, 206, 40, 20);
        spinnerKoerperbeherrschung.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerKoerperbeherrschung);

        spinnerSelbstbeherrschung = new JSpinner();
        spinnerSelbstbeherrschung.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerSelbstbeherrschung.setBounds(136, 206, 40, 20);
        spinnerSelbstbeherrschung.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerSelbstbeherrschung);

        spinnerAexteBeile = new JSpinner();
        spinnerAexteBeile.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerAexteBeile.setBounds(105, 244, 40, 20);
        spinnerAexteBeile.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerAexteBeile);

        spinnerFechtwaffen = new JSpinner();
        spinnerFechtwaffen.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerFechtwaffen.setBounds(105, 272, 40, 20);
        spinnerFechtwaffen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerFechtwaffen);

        spinnerDolche = new JSpinner();
        spinnerDolche.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerDolche.setBounds(105, 300, 40, 20);
        spinnerDolche.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerDolche);

        spinnerArmbrust = new JSpinner();
        spinnerArmbrust.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerArmbrust.setBounds(105, 328, 40, 20);
        spinnerArmbrust.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerArmbrust);

        spinnerBogen = new JSpinner();
        spinnerBogen.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerBogen.setBounds(105, 356, 40, 20);
        spinnerBogen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerBogen);

        spinnerSchwertSblEh = new JSpinner();
        spinnerSchwertSblEh.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerSchwertSblEh.setBounds(317, 244, 40, 20);
        spinnerSchwertSblEh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerSchwertSblEh);

        spinnerSchwertSblZh = new JSpinner();
        spinnerSchwertSblZh.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerSchwertSblZh.setBounds(317, 272, 40, 20);
        spinnerSchwertSblZh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerSchwertSblZh);

        spinnerStumpfEh = new JSpinner();
        spinnerStumpfEh.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerStumpfEh.setBounds(317, 300, 40, 20);
        spinnerStumpfEh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerStumpfEh);

        spinnerStumpfZh = new JSpinner();
        spinnerStumpfZh.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerStumpfZh.setBounds(317, 328, 40, 20);
        spinnerStumpfZh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerStumpfZh);

        spinnerSpeerStab = new JSpinner();
        spinnerSpeerStab.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerSpeerStab.setBounds(317, 356, 40, 20);
        spinnerSpeerStab.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerSpeerStab);

/**TextArea*/

        txtAName = new JTextArea();
        txtAName.setBounds(212, 40, 145, 183);
        txtAName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtAName);

        txtAKonsole = new JTextArea();
        txtAKonsole.setBounds(14, 558, 345, 74);
        txtAKonsole.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtAKonsole);

/**TextField*/

        txtfKopf = new JTextField();
        txtfKopf.setBounds(66, 395, 86, 20);
        txtfKopf.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfKopf);

        txtfBrust = new JTextField();
        txtfBrust.setBounds(66, 426, 86, 20);
        txtfBrust.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfBrust);

        txtfWaffenhand = new JTextField();
        txtfWaffenhand.setBounds(263, 395, 86, 20);
        txtfWaffenhand.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfWaffenhand);

        txtfNebenhand = new JTextField();
        txtfNebenhand.setBounds(263, 426, 86, 20);
        txtfNebenhand.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfNebenhand);

        txtfKlasse = new JTextField();
        txtfKlasse.setBounds(66, 11, 110, 20);
        txtfKlasse.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfKlasse);

        txtfUrl = new JTextField();
        txtfUrl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        txtfUrl.setBounds(66, 470, 86, 20);
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

    public JTextField getTxtfKlasse()
    {
        return this.txtfKlasse;
    }

    public JTextField getTxtfKopf()
    {
        return this.txtfKopf;
    }

    public JTextField getTxtfBrust()
    {
        return this.txtfBrust;
    }

    public JTextField getTxtfWaffenhand()
    {
        return this.txtfWaffenhand;
    }

    public JTextField getTxtfNebenhand()
    {
        return this.txtfNebenhand;
    }

    public JTextField getTxtfUrl()
    {
        return this.txtfUrl;
    }

    public JTextArea getTxtAName()
    {
        return this.txtAName;
    }

    public JTextArea getTxtAKonsole()
    {
        return this.txtAKonsole;
    }

    public JSpinner getSpinnerLebenspunkte()
    {
        return this.spinnerLebenspunkte;
    }

    public JSpinner getSpinnerAstralpunkte()
    {
        return this.spinnerAstralpunkte;
    }

    public JSpinner getSpinnerMut()
    {
        return this.spinnerMut;
    }

    public JSpinner getSpinnerKlugheit()
    {
        return this.spinnerKlugheit;
    }

    public JSpinner getSpinnerIntuition()
    {
        return this.spinnerIntuition;
    }

    public JSpinner getSpinnerCharisma()
    {
        return this.spinnerCharisma;
    }

    public JSpinner getSpinnerFingerfertigkeit()
    {
        return this.spinnerFingerfertigkeit;
    }

    public JSpinner getSpinnerGewandheit()
    {
        return this.spinnerGewandheit;
    }

    public JSpinner getSpinnerKoerperkraft()
    {
        return this.spinnerKoerperkraft;
    }

    public JSpinner getSpinnerKoerperbeherrschung()
    {
        return this.spinnerKoerperbeherrschung;
    }

    public JSpinner getSpinnerSelbstbeherrschung()
    {
        return this.spinnerSelbstbeherrschung;
    }

    public JSpinner getSpinnerAexteBeile()
    {
        return this.spinnerAexteBeile;
    }

    public JSpinner getSpinnerFechtwaffen()
    {
        return this.spinnerFechtwaffen;
    }

    public JSpinner getSpinnerDolche()
    {
        return this.spinnerDolche;
    }

    public JSpinner getSpinnerArmbrust()
    {
        return this.spinnerArmbrust;
    }

    public JSpinner getSpinnerBogen()
    {
        return this.spinnerBogen;
    }

    public JSpinner getSpinnerSchwertSblEh()
    {
        return this.spinnerSchwertSblEh;
    }

    public JSpinner getSpinnerSchwertSblZh()
    {
        return this.spinnerSchwertSblZh;
    }

    public JSpinner getSpinnerStumpfEh()
    {
        return this.spinnerStumpfEh;
    }

    public JSpinner getSpinnerStumpfZh()
    {
        return this.spinnerStumpfZh;
    }

    public JSpinner getSpinnerSpeerStab()
    {
        return this.spinnerSpeerStab;
    }

    public JSpinner getSpinnerAberglaube()
    {
        return this.spinnerAberglaube;
    }
}