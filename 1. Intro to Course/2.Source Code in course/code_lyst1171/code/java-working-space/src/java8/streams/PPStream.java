package java8.streams;

import java.util.Arrays;
import java.util.List;

public class PPStream {
    public static void main(String[] args) {


        List<Integer> numberList = Arrays.asList(2, 5, 6, 3, 5, 9, 8, 12, 26);

        numberList
                .stream()
                .filter(item -> item % 2 == 0)
                .map(item -> item * item)
                .reduce(Integer::sum)
                .ifPresent(System.out::print);

    }

}


