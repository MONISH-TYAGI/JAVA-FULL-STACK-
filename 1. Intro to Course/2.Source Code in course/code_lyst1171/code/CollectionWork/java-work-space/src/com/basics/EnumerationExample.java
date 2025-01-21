package com.basics;

import java.util.*;

public class EnumerationExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("first");
        vector.add("second");
        vector.add("third");
        vector.add("fourth");
        System.out.println(vector);

        Enumeration<String> elements = vector.elements();

        while(elements.hasMoreElements()){
            String s = elements.nextElement();
            System.out.println(s);
        }

        Stack<Integer> stack=new Stack<>();
        stack.push(35);
        stack.push(324);
        Enumeration<Integer> elements1 = stack.elements();
        while(elements1.hasMoreElements()){
            System.out.println(elements1.nextElement());
        }


        System.out.println("++++++++++++++++++");

        vector.forEach(System.out::println);


    }
}
