package View;

import Controller.DetailMapController;

import javax.swing.*;
import java.awt.*;

public class DetailMapView extends JFrame
{
    private JTextField txtfName;
    private JTextArea txtrConsole, txtrPositionen;

    public DetailMapView(DetailMapController paramDetailMapController)
    {
        setTitle("DetailMap");
        setSize(new Dimension(300, 303));
        getContentPane().setLayout(null);

        JLabel lblKonsole = new JLabel("Konsole:");
        lblKonsole.setBounds(10, 62, 58, 14);
        getContentPane().add(lblKonsole);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(10, 31, 58, 14);
        getContentPane().add(lblName);

        JLabel lblPositionen = new JLabel("Positionen:");
        lblPositionen.setBounds(194, 11, 70, 14);
        getContentPane().add(lblPositionen);

        JLabel lblDetail = new JLabel("detail_%");
        lblDetail.setBounds(78, 11, 64, 14);
        getContentPane().add(lblDetail);

        txtfName = new JTextField();
        txtfName.setBounds(78, 31, 86, 20);
        txtfName.requestFocusInWindow();
        getContentPane().add(txtfName);
        txtfName.setColumns(10);

        txtrPositionen = new JTextArea();
        txtrPositionen.setBounds(194, 31, 80, 181);
        getContentPane().add(txtrPositionen);

        txtrConsole = new JTextArea();
        txtrConsole.setBounds(10, 86, 154, 126);
        txtrConsole.setEditable(false);
        getContentPane().add(txtrConsole);

        JButton btnAdd = new JButton("add");
        btnAdd.setBounds(194, 231, 58, 23);
        btnAdd.addActionListener(paramDetailMapController);
        btnAdd.setActionCommand("add");
        getContentPane().add(btnAdd);

        JButton btnReset = new JButton("reset");
        btnReset.setBounds(100, 231, 64, 23);
        btnReset.addActionListener(paramDetailMapController);
        btnReset.setActionCommand("reset");
        getContentPane().add(btnReset);

        JButton btnBack = new JButton("back");
        btnBack.setBounds(10, 231, 64, 23);
        btnBack.addActionListener(paramDetailMapController);
        btnBack.setActionCommand("back");
        getContentPane().add(btnBack);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public JTextField getTxtfName()
    {
        return this.txtfName;
    }

    public JTextArea getTxtrConsole()
    {
        return this.txtrConsole;
    }

    public JTextArea getTxtrPositionen()
    {
        return this.txtrPositionen;
    }
}
