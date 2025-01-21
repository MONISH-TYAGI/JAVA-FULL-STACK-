public class Calculator {

    int x;
    int y;

    // constructor overload
    // non-parameterized constructor
    public Calculator() {
        System.out.println("Creating object:Non-Parameterized construcotr");
        x = 10;
        y = 20;
    }

    public Calculator(int a, int b) {
        System.out.println("Creating object: Parameterized Construtor");
        x = a;
        y = b;
    }

    // method overload

    public void sum() {
        System.out.println("sum is " + (x + y));
    }

    public int sum(int a) {
        System.out.println("sum is " + (x + y + a));
        return (x + y + a);

    }

    public double sum(int a, int b) {
        System.out.println("sum is " + (x + y + a + b));
        return (x + y + a + b);
    }

}
