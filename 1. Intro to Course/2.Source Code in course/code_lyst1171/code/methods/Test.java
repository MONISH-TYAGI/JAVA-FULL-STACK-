
public class Test {

    // formal parameters
    static int addNumber(int a, int b) {

        System.out.println("Sum is " + (a + b));
        a = 560;
        return (a + b);
    }

    static void printSomething() {
        System.out.println("hello,");
        System.out.println("i will do  something for you");
    }

    public static void main(String[] args) {

        System.out.println("Testing");
        // input
        // print
        // logic
        // matrix addition

        printSomething();
        Helper.addSomething();
        Helper.addSomething();

        // actual parameters
        int x = 50;
        int result = addNumber(x, 1112);
        System.out.println("Result in Main " + result);
        System.out.println("value of x = " + x);

    }
}
