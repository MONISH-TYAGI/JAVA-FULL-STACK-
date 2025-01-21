package gui;

import javax.swing.*;
import java.awt.*;

public class SwingExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setSize(440, 440);
        frame.setLocation(20, 20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        component create and add

        JLabel title=new JLabel("Hello World !!");

        frame.getContentPane().add(title,BorderLayout.EAST);

        frame.setVisible(true);


    }
}
