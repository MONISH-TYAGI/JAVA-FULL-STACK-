package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        System.out.println(list);


//        get the object

//        ListIterator<String> listIterator = list.listIterator();
//
//        System.out.println("FD: ");
//        while(listIterator.hasNext())
//        {
//            System.out.println(listIterator.next());
//        }
//

        System.out.println("BD: ");
        ListIterator<String> stringListIterator = list.listIterator(list.size());
        while(stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }

    }
}
