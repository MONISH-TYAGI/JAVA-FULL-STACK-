package java8.features;

import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {

        Set<String> set= Set.of("Durgesh","Ravi","Ankit","abc","a","ram");

        Set<String> newSet = set
                .stream()
                .filter(item -> item.length() > 3)
                .collect(Collectors.toSet());

        System.out.println(set);
        System.out.println(newSet);
    }
}
