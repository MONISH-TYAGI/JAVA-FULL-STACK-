package com.example.demo.couple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class Samosa {
    String name;
    public Samosa(String name)
    {
        System.out.println("this is "+name);
    }
    public void eat(){
        System.out.println("Wow samosa is very spicry");
    }



}
