package com.basics;

import java.sql.Array;
import java.util.*;

public class MethodExample {
    public static void main(String[] args) {

        Collection<Integer> collection=new HashSet<>();
        System.out.println(collection.add(34));
        System.out.println(collection.add(400));
        System.out.println(collection.add(34));
        collection.add(10);
        collection.add(11);
        collection.add(12);
        collection.add(13);
        System.out.println(collection);
//        System.out.println(collection.remove(34));
//        System.out.println(collection);

//        Collection<Integer> collection1=new LinkedList<>();
//        collection1.addAll(collection);
//        System.out.println(collection1);
//
//        System.out.println(collection.contains(340));
//        collection.removeIf( item -> item%2==0 );

//        System.out.println(collection);

        Integer[] array = collection.toArray(new Integer[]{});
        System.out.println(array[0]);
        System.out.println(array[1]);

        List<Integer> integers = List.of(12, 34, 56);

        System.out.println(integers);




    }
}
