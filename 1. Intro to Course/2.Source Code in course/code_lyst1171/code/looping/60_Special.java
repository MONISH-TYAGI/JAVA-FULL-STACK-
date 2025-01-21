class Special {

    static int factorial(int n) {
        int p = 1;
        for (int i = n; i >= 1; i--) {
            p = p * i;
        }
        return p;
    }

    public static void main(String[] args) {
        int n = Helper.inputNumber();
        int sum = 0;
        int n1 = n;
        while (n > 0) {
            int r = n % 10;
            int fact = factorial(r);
            sum = sum + fact;
            n = n / 10;
        }
        if (n1 == sum) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not Special Number");
        }
    }

}
