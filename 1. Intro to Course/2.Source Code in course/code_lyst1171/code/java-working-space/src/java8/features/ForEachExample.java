package java8.features;

import java.util.List;
import java.util.Set;

public class ForEachExample {

    public static void main(String[] args) {
        Set<String> set= Set.of("Durgesh","Ravi","Ankit");
        set.forEach(item->{
            System.out.println("length : "+item.length());
            System.out.println(item);
            System.out.println("_____________");
        });

    }
}
