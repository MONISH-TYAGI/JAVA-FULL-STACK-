package java9;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.*;

public class FactoryMethodsExample {


    public void test(){
        int a=5;
        var b=60;

        var name="durgesh";

        var list=new ArrayList<String>();

        var stream=list.stream();
        var path = Paths.get("");


    }

    public static void main(String[] args) {




        //mutable list
        List<String> list=new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        System.out.println(list);

        //immutable list
        List<String> list1 = Arrays.asList("first", "second", "third", "fourth");
        //this operation can not be done
//        list1.add("fifth");
        System.out.println(list1);

        //of methods static factory methods
        List<String> listImmutable = List.of("first", "second", "third", "fourth", "fifth", "sixth");

        System.out.println(listImmutable);


        //immutable set
        Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7);
//        set.add(312);
        System.out.println(set);

        Map<String, Integer> feeStructure = Map.of("java", 5000, "python", 11000, "spring boot", 9000, "django", 8000);
        System.out.println(feeStructure);
//        feeStructure.put("javascript",45000);
        System.out.println(feeStructure.get("java"));



    }
}
