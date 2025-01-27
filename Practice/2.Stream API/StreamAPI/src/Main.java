import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("java 9 stream");
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,67,2,10);
        integers.stream().takeWhile(item->item<10)
                .forEach(System.out::println);
        //give output 1,2,3,4,5,6 basss
        integers.stream().dropWhile(item->item<10)
                .forEach(System.out::println);
        //give output 67 ,2,10
        String str="this is string";
        Stream<String> str1= Stream.ofNullable(str);
        str1.forEach(System.out::println);
        Stream<Integer> iterate=Stream.iterate(2,item->item<20,item->item*2);
        iterate.forEach(System.out::println);
    }
}