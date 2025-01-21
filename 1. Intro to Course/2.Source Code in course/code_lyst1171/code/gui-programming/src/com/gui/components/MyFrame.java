package com.gui.components;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {


    JButton clickHereButton;
    JLabel headingLabel;

    JTextField textField;

    JTextArea textArea;

    JList<String> list;

    JTable jTable;


    JColorChooser jColorChooser;


    public MyFrame(String title) {

        //setting the title
        setTitle(title);

        //set the height and width
        setSize(500, 500);

        //set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //create component
        createComponents();

        //set the visibility
        pack();
        setVisible(true);


    }

    private void createComponents() {

//        create all the components needed
//        frame hai default layout wo hai: BorderLayout --> NORTH,SOUTH,EAST,WEST,CENTER




        clickHereButton = new JButton("Login");
        headingLabel = new JLabel("Login Here");
        textField = new JTextField(10);
        textArea = new JTextArea();
        list = new JList<>();
        list.setListData(new String[]{"Fmale", "Male", "Other"});
        jColorChooser=new JColorChooser();


        this.getContentPane().add(headingLabel, BorderLayout.NORTH);
        this.getContentPane().add(clickHereButton, BorderLayout.SOUTH);
        this.getContentPane().add(textArea, BorderLayout.CENTER);
        this.getContentPane().add(jColorChooser, BorderLayout.WEST);
        this.getContentPane().add(textField, BorderLayout.EAST);


    }


}
