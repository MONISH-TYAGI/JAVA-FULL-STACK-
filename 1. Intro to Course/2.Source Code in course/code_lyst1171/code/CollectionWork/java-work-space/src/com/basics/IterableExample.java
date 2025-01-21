package com.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IterableExample {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        System.out.println(list);

//        for each :
        for(String str:list)
        {
            System.out.println(str+" : "+str.length());
        }


        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        for(String str:set){
            System.out.println(str);
        }


    }
}
