package View;

import Controller.AttributeTooltipController;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;


public class AttributeTooltipView extends JFrame
{
    private JTextField txtfName;
    private JTextArea txtaConsole, txtaTooltipText;

    public AttributeTooltipView(AttributeTooltipController paramAttributeTooltipController)
    {
        this.txtfName = new JTextField();
        this.txtfName.setBounds(66, 11, 86, 20);
        this.txtfName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        this.getContentPane().add(txtfName);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(10, 14, 46, 14);
        this.getContentPane().add(lblName);

        JLabel lblText = new JLabel("Text:");
        lblText.setBounds(10, 56, 46, 14);
        this.getContentPane().add(lblText);

        JLabel lblXxname = new JLabel("xx_name -> xx : int");
        lblXxname.setBounds(162, 14, 111, 14);
        this.getContentPane().add(lblXxname);

        JButton btnAdd = new JButton("add");
        btnAdd.setBounds(10, 184, 89, 23);
        btnAdd.setActionCommand("add");
        btnAdd.addActionListener(paramAttributeTooltipController);
        this.getContentPane().add(btnAdd);

        JButton btnReset = new JButton("reset");
        btnReset.setBounds(109, 184, 89, 23);
        btnReset.setActionCommand("reset");
        btnReset.addActionListener(paramAttributeTooltipController);
        this.getContentPane().add(btnReset);

        JButton btnBack = new JButton("back");
        btnBack.setBounds(208, 184, 89, 23);
        btnBack.setActionCommand("back");
        btnBack.addActionListener(paramAttributeTooltipController);
        this.getContentPane().add(btnBack);

        this.txtaConsole = new JTextArea();
        this.txtaConsole.setEditable(false);
        this.txtaConsole.setLineWrap(true);
        this.txtaConsole.setWrapStyleWord(true);
        this.txtaConsole.setBounds(20, 218, 274, 100);
        this.txtaConsole.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        this.getContentPane().add(this.txtaConsole);

        this.txtaTooltipText = new JTextArea();
        this.txtaTooltipText.setLineWrap(true);
        this.txtaTooltipText.setWrapStyleWord(true);
        this.txtaTooltipText.setBounds(66, 51, 228, 122);
        this.txtaTooltipText.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        this.getContentPane().add(this.txtaTooltipText);

        this.setSize(new Dimension(310, 357));
        this.getContentPane().setLayout(null);
        this.setResizable(false);
        this.setTitle("attributeTooltip_template");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public String getTooltipText()
    {
        return this.txtaTooltipText.getText();
    }

    public String geTooltipName()
    {

        return this.txtfName.getText();
    }

    public void resetView()
    {
        this.txtfName.setText("");
        this.txtaTooltipText.setText("");
        this.txtfName.requestFocus();
        this.txtaConsole.setText("Reset erfolgreich!");
    }

    public void continueAfterInsert(boolean paramState)
    {
        String message;
        if(paramState)
        {
            message = "Tooltip erfolgreich hinzugefügt!";
        }
        else
            message = "Fehler beim Hinzufügen!\nSQLException @ DBController.addAttributeTooltip()";
        this.txtaConsole.setText(message);
    }

    public void printLengthError()
    {
        this.txtaConsole.setText("Keinen Namen oder keinen TooltipText angegeben?\nLänge von Name muss <= 40 Zeichen sein!\nLänge von TooltipText muss <= 1000 Zeichen sein!");
    }
}