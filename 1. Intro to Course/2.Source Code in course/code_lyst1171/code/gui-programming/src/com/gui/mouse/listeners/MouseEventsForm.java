package com.gui.mouse.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventsForm extends JFrame {
    private JPanel mainPanel;
    private JLabel headingLabel;
    private JLabel textCord;
    private JPanel innerPanel;


    public MouseEventsForm() {
        setTitle("Mouse Event Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        innerPanel.setPreferredSize(new Dimension(600, 400));
        getContentPane().add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        handleEvents();
        setVisible(true);

    }

    private void handleEvents() {

        innerPanel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(innerPanel,"You are in");
            }

        });


        innerPanel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                textCord.setText("Dragged");
                innerPanel.setBackground(Color.RED);

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                innerPanel.setBackground(new Color(27,50,3));
                int x = e.getX();
                int y = e.getY();
                textCord.setText(String.format("( %d , %d )", x, y));

            }
        });

    }

    public static void main(String[] args) {
        new MouseEventsForm();
    }

}
