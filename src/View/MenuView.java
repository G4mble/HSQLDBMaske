package View;

import Controller.ProgramController;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame
{
    public MenuView(ProgramController paramProgramController)
    {
        getContentPane().setLayout(null);

        JButton btnDetailmap = new JButton("detailMap");
        btnDetailmap.setBounds(10, 11, 120, 33);
        btnDetailmap.addActionListener(paramProgramController);
        btnDetailmap.setActionCommand("detailMap");
        getContentPane().add(btnDetailmap);

        JButton btnCharakter = new JButton("charakter");
        btnCharakter.setBounds(10, 55, 120, 33);
        btnCharakter.addActionListener(paramProgramController);
        btnCharakter.setActionCommand("charakter");
        getContentPane().add(btnCharakter);

        JButton btnKreatur = new JButton("waffe");
        btnKreatur.setBounds(10, 99, 120, 33);
        btnKreatur.addActionListener(paramProgramController);
        btnKreatur.setActionCommand("waffe");
        getContentPane().add(btnKreatur);

        JButton btnAttributeTooltip = new JButton("attributeTooltip");
        btnAttributeTooltip.setBounds(10, 143, 120, 33);
        btnAttributeTooltip.addActionListener(paramProgramController);
        btnAttributeTooltip.setActionCommand("attributeTooltip");
        getContentPane().add(btnAttributeTooltip);

        JButton btnBeenden = new JButton("Beenden");
        btnBeenden.setBounds(10, 187, 120, 33);
        btnBeenden.addActionListener(paramProgramController);
        btnBeenden.setActionCommand("beenden");
        getContentPane().add(btnBeenden);

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setSize(new Dimension(145, 259));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
