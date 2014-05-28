package View;

import Controller.CharacterController;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class CharacterView extends JFrame
{
    private JTextField txtfName;

    public CharacterView(CharacterController paramCharacterController)
    {
/**TextField*/

        txtfName = new JTextField();
        txtfName.setBounds(66, 30, 100, 20);
        txtfName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfName);

/**ComboBox*/

        JComboBox comboBoxKlasse = new JComboBox();
        comboBoxKlasse.setModel(new DefaultComboBoxModel(new String[]{"Nahk\u00E4mpfer", "Fernk\u00E4mpfer", "Zauberkundiger"}));
        comboBoxKlasse.setBounds(66, 61, 100, 20);
        getContentPane().add(comboBoxKlasse);

/**Spinner*/

        JSpinner spinnerLebenspunkte = new JSpinner();
        spinnerLebenspunkte.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        spinnerLebenspunkte.setBounds(210, 30, 40, 20);
        spinnerLebenspunkte.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerLebenspunkte);

        JSpinner spinnerAstralpunkte = new JSpinner();
        spinnerAstralpunkte.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        spinnerAstralpunkte.setBounds(210, 61, 40, 20);
        spinnerAstralpunkte.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerAstralpunkte);

        JSpinner spinnerMut = new JSpinner();
        spinnerMut.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerMut.setBounds(46, 119, 40, 20);
        spinnerMut.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerMut);

        JSpinner spinnerKlugheit = new JSpinner();
        spinnerKlugheit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerKlugheit.setBounds(46, 147, 40, 20);
        spinnerKlugheit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerKlugheit);

        JSpinner spinnerIntuition = new JSpinner();
        spinnerIntuition.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerIntuition.setBounds(46, 178, 40, 20);
        spinnerIntuition.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerIntuition);

        JSpinner spinnerCharisma = new JSpinner();
        spinnerCharisma.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerCharisma.setBounds(46, 209, 40, 20);
        spinnerCharisma.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerCharisma);

        JSpinner spinnerFingerfertigkeit = new JSpinner();
        spinnerFingerfertigkeit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerFingerfertigkeit.setBounds(46, 240, 40, 20);
        spinnerFingerfertigkeit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerFingerfertigkeit);

        JSpinner spinnerGewandheit = new JSpinner();
        spinnerGewandheit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerGewandheit.setBounds(46, 270, 40, 20);
        spinnerGewandheit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerGewandheit);

        JSpinner spinnerKoerperkraft = new JSpinner();
        spinnerKoerperkraft.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerKoerperkraft.setBounds(46, 301, 40, 20);
        spinnerKoerperkraft.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(spinnerKoerperkraft);

        JSpinner spinnerAberglaube = new JSpinner();
        spinnerAberglaube.setBounds(160, 119, 40, 20);
        spinnerAberglaube.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        spinnerAberglaube.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerAberglaube);

        JSpinner spinnerHoehenangst = new JSpinner();
        spinnerHoehenangst.setBounds(160, 147, 40, 20);
        spinnerHoehenangst.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        spinnerHoehenangst.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerHoehenangst);

        JSpinner spinnerRaumangst = new JSpinner();
        spinnerRaumangst.setBounds(160, 178, 40, 20);
        spinnerRaumangst.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        spinnerRaumangst.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerRaumangst);

        JSpinner spinnerTotenangst = new JSpinner();
        spinnerTotenangst.setBounds(160, 209, 40, 20);
        spinnerTotenangst.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        spinnerTotenangst.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerTotenangst);

        JSpinner spinnerNeugier = new JSpinner();
        spinnerNeugier.setBounds(160, 240, 40, 20);
        spinnerNeugier.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        spinnerNeugier.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerNeugier);

        JSpinner spinnerGoldgier = new JSpinner();
        spinnerGoldgier.setBounds(160, 270, 40, 20);
        spinnerGoldgier.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        spinnerGoldgier.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerGoldgier);

        JSpinner spinnerJaehzorn = new JSpinner();
        spinnerJaehzorn.setBounds(160, 301, 40, 20);
        spinnerJaehzorn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        spinnerJaehzorn.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spinnerJaehzorn);

/**Buttons*/

        JButton btnReset = new JButton("reset");
        btnReset.setBounds(111, 376, 89, 23);
        btnReset.addActionListener(paramCharacterController);
        btnReset.setActionCommand("reset");
        getContentPane().add(btnReset);

        JButton btnBack = new JButton("back");
        btnBack.setBounds(12, 376, 89, 23);
        btnBack.addActionListener(paramCharacterController);
        btnBack.setActionCommand("back");
        getContentPane().add(btnBack);

        JButton btnAdd = new JButton("add");
        btnAdd.setBounds(210, 376, 89, 23);
        btnAdd.addActionListener(paramCharacterController);
        btnAdd.setActionCommand("add");
        getContentPane().add(btnAdd);

/**Label*/

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(10, 33, 46, 14);
        getContentPane().add(lblName);

        JLabel lblKlasse = new JLabel("Klasse:");
        lblKlasse.setBounds(10, 64, 46, 14);
        getContentPane().add(lblKlasse);

        JLabel lblLebenspunkte = new JLabel("LeP:");
        lblLebenspunkte.setBounds(176, 33, 36, 14);
        getContentPane().add(lblLebenspunkte);

        JLabel lblAstralpunkte = new JLabel("AsP:");
        lblAstralpunkte.setBounds(176, 64, 30, 14);
        getContentPane().add(lblAstralpunkte);

        JLabel lblMut = new JLabel("MU:");
        lblMut.setBounds(10, 122, 46, 14);
        getContentPane().add(lblMut);

        JLabel lblKlugheit = new JLabel("KL:");
        lblKlugheit.setBounds(10, 150, 30, 14);
        getContentPane().add(lblKlugheit);

        JLabel lblIntuition = new JLabel("IN:");
        lblIntuition.setBounds(10, 181, 30, 14);
        getContentPane().add(lblIntuition);

        JLabel lblCharisma = new JLabel("CH:");
        lblCharisma.setBounds(10, 212, 30, 14);
        getContentPane().add(lblCharisma);

        JLabel lblFingerfertigkeit = new JLabel("FF:");
        lblFingerfertigkeit.setBounds(10, 243, 30, 14);
        getContentPane().add(lblFingerfertigkeit);

        JLabel lblGewandheit = new JLabel("GE:");
        lblGewandheit.setBounds(10, 273, 30, 14);
        getContentPane().add(lblGewandheit);

        JLabel lblKrperkraft = new JLabel("KK:");
        lblKrperkraft.setBounds(10, 304, 30, 14);
        getContentPane().add(lblKrperkraft);

        JLabel lblAbeerglauber = new JLabel("AG:");
        lblAbeerglauber.setBounds(120, 122, 30, 14);
        getContentPane().add(lblAbeerglauber);
        JLabel lblHoehenangst = new JLabel("HA:");
        lblHoehenangst.setBounds(120, 150, 30, 14);
        getContentPane().add(lblHoehenangst);

        JLabel lblRaumangst = new JLabel("RA:");
        lblRaumangst.setBounds(120, 181, 30, 14);
        getContentPane().add(lblRaumangst);

        JLabel lblTotenangst = new JLabel("TA:");
        lblTotenangst.setBounds(120, 212, 30, 14);
        getContentPane().add(lblTotenangst);

        JLabel lblNeugier = new JLabel("NG:");
        lblNeugier.setBounds(120, 243, 30, 14);
        getContentPane().add(lblNeugier);

        JLabel lblGoldgier = new JLabel("GG:");
        lblGoldgier.setBounds(120, 273, 30, 14);
        getContentPane().add(lblGoldgier);

        JLabel lblJaehzorn = new JLabel("JZ:");
        lblJaehzorn.setBounds(120, 304, 30, 14);
        getContentPane().add(lblJaehzorn);

/**Separator*/

        JSeparator separator = new JSeparator();
        separator.setBorder(null);
        separator.setBounds(10, 103, 264, 20);
        getContentPane().add(separator);

/**Properties*/

        this.setTitle("Charakter_template");
        this.setSize(new Dimension(800, 800));
        this.getContentPane().setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public JTextField getTxtfName()
    {
        return this.txtfName;
    }
}
