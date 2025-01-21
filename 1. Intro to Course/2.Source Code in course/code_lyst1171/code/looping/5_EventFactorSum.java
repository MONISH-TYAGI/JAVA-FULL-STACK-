class EvenFactorSum {

    static void printEvenFactorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // factor
            if (n % i == 0) {

                // even check
                if (i % 2 == 0) {
                    // sum
                    sum = sum + i;
                }
            }
        }
        System.out.println("Even Factor sum: " + sum);
    }

    public static void main(String[] args) {
        int n = Helper.inputNumber();
        printEvenFactorSum(n);
    }
}
