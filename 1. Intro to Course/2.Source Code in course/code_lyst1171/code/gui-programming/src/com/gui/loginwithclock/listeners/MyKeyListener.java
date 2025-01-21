package com.gui.loginwithclock.listeners;

import com.gui.loginwithclock.MainWindow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {

    MainWindow mainWindow;

    public MyKeyListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("Key pressed "+e.getKeyChar());
//        String text = mainWindow.getUserNameField().getText();
//        mainWindow.getFieldLabel().setText(text);
    }
}
