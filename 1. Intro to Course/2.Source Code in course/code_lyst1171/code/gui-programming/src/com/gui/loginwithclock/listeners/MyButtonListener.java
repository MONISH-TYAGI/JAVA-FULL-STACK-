package com.gui.loginwithclock.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //code : jo ap chahte ho execute karna
        System.out.println("Button clicked");
        var source = (JButton) e.getSource();
        System.out.println(source.getText());
        source.setText("Login clicked");
        source.setBackground(Color.RED);
        source.setForeground(Color.RED);
        source.repaint();
        JOptionPane.showMessageDialog(source.getParent().getParent(), "Login clicked");
    }
}
