package generics;

import java.util.ArrayList;
import java.util.List;

public class Concepts {

    static void doWork(List<Integer> list) {


//         list process
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);
            System.out.println(number);
        }

    }

    public static void main(String[] args) {

        //  Typesafe
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
//        arrayList.add("Durgesh");
//        arrayList.add(40.234);
//        arrayList.add('A');
        arrayList.add(23);
        arrayList.add(35);
        arrayList.add(90);

        System.out.println(arrayList);

        doWork(arrayList);


    }
}
