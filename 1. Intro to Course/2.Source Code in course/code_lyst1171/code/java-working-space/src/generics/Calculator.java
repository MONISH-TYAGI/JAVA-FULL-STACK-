package generics;

import java.util.Scanner;

public class Calculator<T> {

    //    int, float, double , short byte
    public T object1;
    public T object2;

    public Calculator(T object1, T object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public void printData() {
        System.out.println(object1);
        System.out.println(object2);
    }

    public void calculate() {
        System.out.println("calculating ...");
        if (object1 instanceof Number) {

            System.out.println("This is number: do number specific work");
        } else if (object1 instanceof String) {
            System.out.println("String specific work");
        } else if (object1 instanceof Scanner) {
            System.out.println("Scanner specific work");
            System.out.println("Enter number :");
            int i = ((Scanner) object1).nextInt();
            System.out.println("The number is : " + i);
        }
    }

}
