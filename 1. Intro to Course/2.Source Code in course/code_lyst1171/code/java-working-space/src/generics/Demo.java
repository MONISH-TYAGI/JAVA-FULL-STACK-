package generics;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Demo {
    public static void main(String[] args) {
//
//        Calculator<Scanner> calculator = new Calculator<>(new Scanner(System.in), new Scanner(System.in));
//        calculator.printData();
//        calculator.calculate();

        String names[] = {
                "Ram",
                "shaym",
                "Ravi",
                "Dharam"
        };

        Integer numbers[] = {
                12,
                12, 46, 46
        };

        Helper.<Integer, String>printData(numbers, "Second parameter");




    }
}
