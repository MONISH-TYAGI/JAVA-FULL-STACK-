public class CalcDemo {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(200, 100);

        c1.sum();
        c2.sum();
        int result1 = c1.sum(50);

        double result = c1.sum(1, 2);
        System.out.println(result);
        System.out.println(result1);

    }
}
