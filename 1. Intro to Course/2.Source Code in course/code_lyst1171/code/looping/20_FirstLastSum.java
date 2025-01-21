class FirstLastSum {

    public static void main(String[] args) {
        int n = Helper.inputNumber();
        int lastDigit = n % 10;
        int digits = CountDigits.countDigits(n);
        int firstDigit = n / ((int) Math.pow(10, digits - 1));
        System.out.println("First and Last Digit Sum is " + (firstDigit + lastDigit));

    }
}
