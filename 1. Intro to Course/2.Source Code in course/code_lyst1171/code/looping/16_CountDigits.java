class CountDigits {

    static int countDigits(int n) {
        int counter = 0;
        while (n != 0) {
            int r = n % 10;
            counter++;
            n = n / 10;
        }
        // System.out.println("Digit Count is " + counter);
        return counter;
    }

    public static void main(String[] args) {

        int number = Helper.inputNumber();
        countDigits(number);

    }
}
