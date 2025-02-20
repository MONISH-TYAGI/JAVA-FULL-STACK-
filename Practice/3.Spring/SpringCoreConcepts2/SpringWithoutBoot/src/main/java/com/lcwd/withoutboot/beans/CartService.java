package com.lcwd.withoutboot.beans;

import org.springframework.stereotype.Component;

@Component
public class CartService {
    public void createCart(){
        System.out.println("one cart is created");
    }
}
