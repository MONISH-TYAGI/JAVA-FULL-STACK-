class SmallDigit {

    public static void main(String[] args) {

        int n = Helper.inputNumber();

        int small = n % 10;
        while (n > 0) {
            int r = n % 10;
            if (r < small) {
                small = r;
            }
            n = n / 10;
        }

        System.out.println("Samallest Value " + small);

    }
}
