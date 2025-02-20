package com.lcwd.withoutboot.beans;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void saveUser(){
        System.out.println("one order is created");
    }
}
