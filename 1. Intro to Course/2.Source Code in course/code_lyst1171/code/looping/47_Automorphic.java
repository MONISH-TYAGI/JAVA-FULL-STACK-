class Automorphic {
    public static void main(String[] args) {

        int n = Helper.inputNumber();

        int square = n * n;

        int countDigit = CountDigits.countDigits(n);

        int lastDigits = square % ((int) (Math.pow(10, countDigit)));
        System.out.println("Square : " + square);
        System.out.println("Last digits : " + lastDigits);
        if (n == lastDigits) {
            System.out.println("Automorphic Number");

        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
