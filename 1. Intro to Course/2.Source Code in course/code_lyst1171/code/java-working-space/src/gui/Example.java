package gui;

import java.awt.*;

public class Example {


    public static void main(String[] args) {

        Button button = new Button("Click");
        Frame frame = new Frame("First Window");
        frame.setSize(400, 400);
        frame.add(button);
        frame.setVisible(true);


    }
}
