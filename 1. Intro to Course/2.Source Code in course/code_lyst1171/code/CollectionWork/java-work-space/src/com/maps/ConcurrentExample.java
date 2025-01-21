package com.maps;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentExample {
    public static void main(String[] args) {


        List<String> list = new CopyOnWriteArrayList<>();

        list.add("wow");
        list.add("working fine");

        System.out.println(list);

    }
}
