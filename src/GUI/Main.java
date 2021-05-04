package src.GUI;

import src.GUI.FrameSystem;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: Master 2D Calculator
 * Author: ARCHISMAN NATH and DANIEL KAIYALI on 5/1/2021 in 12:08 PM
 */
public class Main implements ActionListener {
    private static JPanel SidePanel;
    private static JPanel BottomPanel;
    private static FrameSystem Window;
    private static JTextField lengthInputfld;
    private static JTextField widthInputfld;
    private static JLabel lengthlbl;
    private static JLabel widthlbl;



    public static void main(String[] args) {
        foundation();
    }

    public static void foundation(){
        Window = new FrameSystem();
        SidePanel = new JPanel();
        BottomPanel = new JPanel();
        lengthInputfld = new JTextField(1);
        widthInputfld = new JTextField(1);
        lengthlbl = new JLabel();
        widthlbl = new JLabel();

        SidePanel.setBounds(0, 0, 50, 650);
        SidePanel.setBackground(new Color(28, 27, 27));
        SidePanel.setSize(250, 700);
        Border redLine= BorderFactory.createLineBorder(new Color(144, 16, 16));
        SidePanel.setBorder(redLine);
        Window.add(SidePanel);

        BottomPanel.setBounds(200, 500, 600, 100);
        BottomPanel.setBackground(new Color(28, 27, 27));
        BottomPanel.setSize(600, 200);
        BottomPanel.setBorder(redLine);
        Window.add(BottomPanel);

        dimensionsInput();

    }

    public static void dimensionsInput(){
        lengthInputfld.setBounds(400, 550, 25, 25);
        Window.add(lengthInputfld);
        lengthlbl.setBounds(0,10,50,50); // working on
        lengthlbl.setText("Length");
        lengthlbl.setForeground(Color.WHITE);
        lengthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,20));
        BottomPanel.add(lengthlbl);

        // add widthlbl in project - Done
        // set the label to the correct area
        widthInputfld.setBounds(400, 600, 25, 25);
        Window.add(widthInputfld);
        widthlbl.setBounds(10,100,50,50); // working on
        widthlbl.setText("Width");
        widthlbl.setForeground(Color.WHITE);
        widthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,20));
        BottomPanel.add(widthlbl);

        Window.setVisible(true);
    }




    // do not remove this method
    @Override
    public void actionPerformed(ActionEvent e) {

    }




}




