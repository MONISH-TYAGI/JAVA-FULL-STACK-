class PrimeFactorization {

    public static void main(String[] args) {

        int n = Helper.inputNumber();

        int i = 2;

        do {
            if (n % i == 0) {

                n = n / i;

                if (n <= 1)
                    System.out.print(i);
                else
                    System.out.print(i + "x");

            } else {
                i++;
            }
        } while (n > 1);
        System.out.println();

    }

}
