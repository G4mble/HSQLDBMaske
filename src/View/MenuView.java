package View;

import Controller.ProgramController;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame
{
    public MenuView(ProgramController paramProgramController)
    {
        getContentPane().setLayout(null);

        JButton btnDetailmap = new JButton("DetailMap");
        btnDetailmap.setBounds(10, 11, 120, 33);
        btnDetailmap.addActionListener(paramProgramController);
        btnDetailmap.setActionCommand("detailMap");
        getContentPane().add(btnDetailmap);

        JButton btnCharakter = new JButton("Charakter");
        btnCharakter.setBounds(10, 55, 120, 33);
        btnCharakter.addActionListener(paramProgramController);
        btnCharakter.setActionCommand("charakter");
        getContentPane().add(btnCharakter);

        JButton btnKreatur = new JButton("Kreatur");
        btnKreatur.setBounds(10, 99, 120, 33);
        btnKreatur.addActionListener(paramProgramController);
        btnKreatur.setActionCommand("kreatur");
        getContentPane().add(btnKreatur);

        JButton btnBeenden = new JButton("Beenden");
        btnBeenden.setBounds(10, 143, 120, 33);
        btnBeenden.addActionListener(paramProgramController);
        btnBeenden.setActionCommand("beenden");
        getContentPane().add(btnBeenden);

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setSize(new Dimension(145, 215));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
