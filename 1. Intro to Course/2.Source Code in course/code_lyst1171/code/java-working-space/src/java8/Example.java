package java8;

public class Example {
    public static void main(String[] args) {

        System.out.println("Exploring lambda expression");

        MyInter myInter = () -> System.out.println("myMethod implementation using lambda");

        MyInter myInter1 = () -> {
            System.out.println("First line");
            System.out.println("Second line");
            System.out.println("Third line");
        };

        myInter.myMethod();
        myInter1.myMethod();

        System.out.println("--------------------------------------");

        Addition addition = (int a, int b, int c) -> {
            //code body
            int sum = a + b + c;
            System.out.println("sum is " + sum);
        };

        addition.add(12, 12, 12);


    }
}
