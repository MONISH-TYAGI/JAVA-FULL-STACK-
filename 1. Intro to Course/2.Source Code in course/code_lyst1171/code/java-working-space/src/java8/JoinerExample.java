package java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinerExample {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",", "{", "}");
        joiner.add("Ram");
        joiner.add("Ankit");
        joiner.add("Rahul");
        joiner.add("Ahmad");

        System.out.println(joiner);
        System.out.println(joiner.length());

        StringJoiner joiner1 = new StringJoiner("-");
        joiner1.add("its good to have you");
        joiner1.add("working fine");

        System.out.println(joiner1);
        StringJoiner merge = joiner.merge(joiner1);

        System.out.println(merge);
        System.out.println("____________");
        List<String> list = Arrays.asList("Work", "Hard", "for", "success");
        String str = list.stream().map(item -> item.toUpperCase()).collect(
                Collectors.joining("-")
        );

        System.out.println(str);


    }
}
