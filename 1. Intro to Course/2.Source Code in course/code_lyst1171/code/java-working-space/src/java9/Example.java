package java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {

        System.out.println("java 9 stream ");
        List<Integer> integers = Arrays.asList(2, 44, 4, 1, 2, 3, 4, 5, 15, 22, 14, 32, 15);
        integers.stream()
                .takeWhile(item -> item % 2 == 0)
                .forEach(System.out::println);
        System.out.println("---------------");
        integers.stream().dropWhile(item -> item % 2 == 0)
                .forEach(System.out::println);

        System.out.println("--------------");

        String str = "this is string ";
        Stream<String> str1 = Stream.ofNullable(str);
        str1.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(2, item -> item < 20, item -> item * 2);
        iterate.forEach(System.out::println);


    }
}
