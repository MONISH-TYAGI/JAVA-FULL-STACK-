package com.gui.loginwithclock;

import com.gui.loginwithclock.listeners.MyButtonListener;
import com.gui.loginwithclock.listeners.MyKeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {

    private JLabel titleHeading, userNameLabel, passwordLabel;
    private JTextField userNameField;
    private JPasswordField passwordField;

    private Font headingFont = new Font("Menlo", Font.BOLD, 28);
    private Font textFont = new Font("Menlo", Font.PLAIN, 25);

    private JLabel clockLabel, timerLabel, fieldLabel;
    private JButton startTimerButton, resetTimerButton, loginButton, resetButton;

    private JPanel southPanel, centerPanel;


    public MainWindow(String title) {
        setTitle(title);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents();
        handleEvents();
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    private void handleEvents() {


        //        i am sure login button apki create ho chuki hai.
//        button ko listener ke sath add karne se pahle hame listener banna padega
//        Normal Class
//        Anonymous class
//        Lambda [Functional Interface ke case mein]

        var myButtonEvent = new MyButtonListener();
//                add the listener to button
        loginButton.addActionListener(myButtonEvent);


//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button clicked using anonymous class");
//            }
//        });
//
//        loginButton.addActionListener(event -> {
//            System.out.println("button clicked using lambda");
//        });


        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int result = JOptionPane.showConfirmDialog(MainWindow.this, "Are you sure ?");
//                JOptionPane.showMessageDialog(MainWindow.this, result);
                if (result == 0) {
                    //create the form

                    userNameField.setText("");
                    passwordField.setText("");

                    JOptionPane.showMessageDialog(MainWindow.this, "Form Cleared", "Form Clear Message", JOptionPane.ERROR_MESSAGE);
                } else if (result == 1) {
                    JOptionPane.showMessageDialog(MainWindow.this, "OK");
                } else if (result == 2) {
                    JOptionPane.showMessageDialog(MainWindow.this, "Cancelled");
                }


            }
        });

//        handle keyboard events

//        userNameField.addKeyListener(new MyKeyListener(this));

        userNameField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                String text = userNameField.getText();
                fieldLabel.setText(text);
            }
        });

    }


    private void createComponents() {
        //this--> Broder layout[NORTH,SOUTH,EAST,WEST,CENTER]
        this.setLayout(new BorderLayout());
        initComponent();
        fieldLabel.setFont(textFont);


//        THIS--> NORTH
        //title size --> bold center
        ImageIcon imageIcon = new ImageIcon("src/images/login_logo.png");

        titleHeading.setIcon(imageIcon);
        titleHeading.setIconTextGap(20);
        titleHeading.setFont(headingFont);
        titleHeading.setHorizontalTextPosition(SwingConstants.CENTER);
        titleHeading.setVerticalTextPosition(SwingConstants.BOTTOM);

//        setting the text position
//        image ke relative
//        titleHeading.setHorizontalTextPosition(JLabel.CENTER);
        titleHeading.setHorizontalAlignment(JLabel.CENTER);
        titleHeading.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));


//        THIS--> CENTER
//        TitledBorder titledBorder = BorderFactory.createTitledBorder("Fill details correctly");
//        titledBorder.setTitlePosition(TitledBorder.TOP);
//        titledBorder.setTitleFont(new Font("",Font.ITALIC,10));
//        centerPanel.setBorder(titledBorder);

//        centerPanel.setBorder(BorderFactory.createDashedBorder(
//                Color.RED,
//                5,
//                10,
//                2,
//                true
//        ));

//        centerPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

//        centerPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

        centerPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20),
                BorderFactory.createTitledBorder("Fill form:")

        ));


        centerPanel.setLayout(new GridLayout(3, 2));
        userNameLabel.setFont(textFont);
        userNameField.setFont(textFont);
        passwordField.setFont(textFont);
        passwordLabel.setFont(textFont);
        loginButton.setFont(textFont);
        resetButton.setFont(textFont);
        userNameLabel.setHorizontalAlignment(JLabel.CENTER);
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);
        centerPanel.add(userNameLabel);
        centerPanel.add(userNameField);
        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);
        centerPanel.add(loginButton);
        centerPanel.add(resetButton);


//        THIS--> SOUTH

        //panel--> Flow
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 2));
        southPanel.add(clockLabel);
        southPanel.add(timerLabel);
        southPanel.add(startTimerButton);
        southPanel.add(resetTimerButton);
        southPanel.add(fieldLabel);

        this.add(titleHeading, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(centerPanel);

    }

    private void initComponent() {
        //init components
        titleHeading = new JLabel("Login With Clock");
        timerLabel = new JLabel("00:00:00");
        clockLabel = new JLabel("01:25 AM");
        startTimerButton = new JButton("START");
        resetTimerButton = new JButton("RESET");
        fieldLabel = new JLabel("text of field");
        southPanel = new JPanel();
        centerPanel = new JPanel();

        userNameField = new JTextField();
        userNameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        resetButton = new JButton("RESET FORM");

    }
//
//    // creating all getters of all fields
//    public JLabel getTitleHeading() {
//        return titleHeading;
//    }
//
//    public JLabel getUserNameLabel() {
//        return userNameLabel;
//    }
//
//    public JLabel getPasswordLabel() {
//        return passwordLabel;
//    }
//
//    public JTextField getUserNameField() {
//        return userNameField;
//    }
//
//    public JPasswordField getPasswordField() {
//        return passwordField;
//    }
//
//    public Font getHeadingFont() {
//        return headingFont;
//    }
//
//    public Font getTextFont() {
//        return textFont;
//    }
//
//    public JLabel getClockLabel() {
//        return clockLabel;
//    }
//
//    public JLabel getTimerLabel() {
//        return timerLabel;
//    }
//
//    public JLabel getFieldLabel() {
//        return fieldLabel;
//    }
//
//    public JButton getStartTimerButton() {
//        return startTimerButton;
//    }
//
//    public JButton getResetTimerButton() {
//        return resetTimerButton;
//    }
//
//    public JButton getLoginButton() {
//        return loginButton;
//    }
//
//    public JButton getResetButton() {
//        return resetButton;
//    }
//
//    public JPanel getSouthPanel() {
//        return southPanel;
//    }
//
//    public JPanel getCenterPanel() {
//        return centerPanel;
//    }
}
