package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {

    public static void printList(List<? super Integer> list) {

        System.out.println(list);

    }

    public static void main(String[] args) {


//        any type: ?
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        printList(Arrays.asList(23.23, 34.6, 456.78));
        printList(list1);
        printList(List.of(new Object()));



    }
}
