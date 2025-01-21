package java8.streams;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args) {

//        1. Empty Stream
        Stream<Object> emptyStream = Stream.empty();
        System.out.println(emptyStream.count());

//        2. Stream from collection
        List<String> laptops = new ArrayList<>();
        laptops.add("Macbook pro");
        laptops.add("HP 123541");
        laptops.add("Leveno 23523");

        Stream<String> collectionStream = laptops.stream();
        System.out.println(collectionStream.count());

//        3. Stream of array
        Stream<Integer> integerStream = Stream.of(2, 7, 8, 93, 5);
        System.out.println(integerStream.count());

        String studentNames[] = {
                "ram",
                "shyam",
                "ravi",
                "ratan"
        };

        Stream<String> arrayStream = Arrays.stream(studentNames);
        System.out.println(arrayStream.count());


//        4. Using builder to create stream
        Stream<Integer> integerStream1 = Stream.<Integer>builder()
                .add(24)
                .add(14)
                .add(312)
                .add(9)
                .build();
        System.out.println(integerStream1.count());

//        5. creating stream using generate
        Stream<String> generatedStream = Stream.generate(() -> "durgesh").limit(5);

//        generatedStream.forEach(System.out::println);
        System.out.println("stream generated");
        System.out.println("count value" + generatedStream.count());

//        6. creating stream using iterate
        Stream<Integer> itrStream = Stream.iterate(100, (n) -> n + 2).limit(5);
//        System.out.println(itrStream.count());
        itrStream.forEach(System.out::println);

//        7. creating streams using primitive streams
        IntStream rangeStream = IntStream.range(1, 10);

//        System.out.println(rangeStream.count());
        rangeStream.forEach(System.out::println);

        IntStream chars = "this is testing".chars();
        chars.forEach((item)-> {
            System.out.println((char)item);
        });
    }
}
