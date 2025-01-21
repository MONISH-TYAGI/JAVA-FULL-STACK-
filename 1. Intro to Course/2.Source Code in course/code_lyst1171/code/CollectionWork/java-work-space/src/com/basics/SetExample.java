package com.basics;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(300);
        set.add(500);
        set.add(23);
        set.add(null);


        System.out.println(set);

        Set<Integer> linkedset = new LinkedHashSet<>();
        linkedset.add(1);
        linkedset.add(2);
        linkedset.add(3);
        linkedset.add(4);
        linkedset.add(null);
        linkedset.add(null);
        System.out.println(linkedset);

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(435);
        treeSet.add(12);
        treeSet.add(44);
        treeSet.add(1);
        treeSet.add(22);
        treeSet.add(100);

        System.out.println(treeSet);


    }
}
