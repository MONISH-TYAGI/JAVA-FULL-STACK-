package java8;

import java.util.ArrayList;
import java.util.List;

public class TypeRefExample {

    public static void printList(List<String> strList){

    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(2323);

        printList(new ArrayList<>());


    }
}
