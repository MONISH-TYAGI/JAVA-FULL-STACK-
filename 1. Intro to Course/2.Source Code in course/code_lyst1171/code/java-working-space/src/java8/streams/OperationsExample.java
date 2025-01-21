package java8.streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperationsExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("LUCKNOW", "DELHI", "KANPUR", "MUMBAI", "BANGLORE");
        List<Integer> numberList = Arrays.asList(2, 5, 6, 3, 5, 9, 8, 12, 26);
        System.out.println(list);
        //1 operation- forEach
        list.forEach((item) -> {
            System.out.println(item);
            System.out.println("length = " + item.length());
            System.out.println("==============");
        });

        //2 operation- filter
        System.out.println(numberList);
        numberList
                .stream()
                .filter(item -> item % 2 == 0)
                .forEach(System.out::print);

        //3. operation - map
//        [2, 5, 6, 3, 5, 9, 8, 12, 26]
        System.out.println();
        numberList
                .stream()
                .map((item -> item * item))
                .forEach(System.out::println);

        System.out.println();

//        4. operation - reduce
        numberList
                .stream()
                .reduce((item1, item2) -> item1 + item2)
                .ifPresent(System.out::println);

        //5. collect

        Set<Integer> filteredList = numberList
                .stream()
                .filter(item -> item % 2 != 0)
                .collect(Collectors.toSet());

        System.out.println(filteredList);

//        6. operation - findFirst

        numberList
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

//        7. Operation

        List<Integer> list1 = numberList
                .stream()
                .sorted((item1, item2) -> item2 - item1)
                .collect(Collectors.toList());
        System.out.println(list1);

        list
                .stream()
                .sorted((item1, item2) -> -item1.compareTo(item2))
                .forEach(System.out::print);
        System.out.println();

        List<Integer> marks = Arrays.asList(1, 1, 1, 3, 3, 4, 5, 56, 56);
        marks
                .stream()
                .distinct()
                .forEach(System.out::print);

        System.out.println();
        System.out.println("-----------------");

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6, 7, 8)
        );

        List<Integer> collectedList = nestedList.
                stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(collectedList);

        collectedList
                .stream()
                .skip(4)
                .forEach(System.out::print);

        System.out.println();

        collectedList.stream().limit(5).forEach(System.out::println);


    }
}
