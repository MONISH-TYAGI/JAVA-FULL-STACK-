package com.example.demo.couple;


import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements  Animal{
    @Override
    public void play(){
        System.out.println("cat is playing");
    }
}
