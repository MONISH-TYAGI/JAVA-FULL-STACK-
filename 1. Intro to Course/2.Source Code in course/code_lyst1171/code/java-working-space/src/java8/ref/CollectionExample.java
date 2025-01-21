package java8.ref;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(35);
        list.add(2135);
        list.add(235);

        list.forEach(System.out::println);

    }
}
