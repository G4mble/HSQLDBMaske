package View;

import Controller.DetailMapController;

import javax.swing.*;
import java.awt.*;

public class DetailMapView extends JFrame
{
    private JTextField txtfUrl, txtfName;
    private JTextArea txtrConsole, txtrPositionen;

    public DetailMapView(DetailMapController paramDetailMapController)
    {
        setTitle("DetailMap");
        setSize(new Dimension(275, 290));
        getContentPane().setLayout(null);

        JLabel lblKonsole = new JLabel("Konsole:");
        lblKonsole.setBounds(10, 87, 58, 14);
        getContentPane().add(lblKonsole);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(10, 31, 58, 14);
        getContentPane().add(lblName);

        JLabel lblUrl = new JLabel("URL:");
        lblUrl.setBounds(10, 62, 46, 14);
        getContentPane().add(lblUrl);

        JLabel lblPositionen = new JLabel("Positionen:");
        lblPositionen.setBounds(174, 11, 70, 14);
        getContentPane().add(lblPositionen);

        txtfName = new JTextField();
        txtfName.setBounds(78, 31, 86, 20);
        txtfName.requestFocusInWindow();
        getContentPane().add(txtfName);
        txtfName.setColumns(10);

        txtfUrl = new JTextField();
        txtfUrl.setBounds(78, 62, 86, 20);
        getContentPane().add(txtfUrl);
        txtfUrl.setColumns(10);

        txtrPositionen = new JTextArea();
        txtrPositionen.setBounds(174, 31, 80, 185);
        getContentPane().add(txtrPositionen);

        txtrConsole = new JTextArea();
        txtrConsole.setBounds(10, 111, 154, 105);
        txtrConsole.setEditable(false);
        getContentPane().add(txtrConsole);

        JButton btnAdd = new JButton("add");
        btnAdd.setBounds(184, 227, 58, 23);
        btnAdd.addActionListener(paramDetailMapController);
        btnAdd.setActionCommand("add");
        getContentPane().add(btnAdd);

        JButton btnReset = new JButton("reset");
        btnReset.setBounds(100, 227, 64, 23);
        btnReset.addActionListener(paramDetailMapController);
        btnReset.setActionCommand("reset");
        getContentPane().add(btnReset);

        JButton btnBack = new JButton("back");
        btnBack.setBounds(20, 227, 64, 23);
        btnBack.addActionListener(paramDetailMapController);
        btnBack.setActionCommand("back");
        getContentPane().add(btnBack);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public JTextField getTxtfUrl()
    {
        return this.txtfUrl;
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
