package com.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        System.out.println(list);

//getting Iterator object


        Iterator<String> iterator = list.iterator();

// traverse kar sakte hai iterator ki help se
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+" : "+next.toUpperCase());
        }



    }
}
