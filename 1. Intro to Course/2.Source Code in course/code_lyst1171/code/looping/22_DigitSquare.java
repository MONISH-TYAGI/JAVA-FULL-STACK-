class DigitSquare {

    public static void main(String[] args) {

        int n = Helper.inputNumber();
        int sum = 0;
        while (n > 0) {

            int countDigit = CountDigits.countDigits(n);
            int digit = n / ((int) Math.pow(10, countDigit - 1));
            System.out.print((digit * digit) + "\t");
            sum = sum + (digit * digit);
            n = n % ((int) Math.pow(10, countDigit - 1));

        }

        System.out.println();
        System.out.println("Sum of square of digits " + sum);

    }

}
