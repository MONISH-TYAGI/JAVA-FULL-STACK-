package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ThreadExample {
    public static void main(String[] args) {


        Thread thread = new Thread(() -> {
            System.out.println("new thread");
        });

        List<String> list = new ArrayList<>();
        list.add("Durgesh");
        list.add("Ankit");


        list.forEach((String x) -> {
            System.out.println(x);
        });


    }
}
