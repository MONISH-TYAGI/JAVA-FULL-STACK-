package main;

import lcwd.main.controller.*;

public class MainDemo {

    protected int a = 30;

    public static void main(String[] args) {

        new PageController();
        MainDemo mainDemo = new MainDemo();
        System.out.println(mainDemo.a);
    }
}
