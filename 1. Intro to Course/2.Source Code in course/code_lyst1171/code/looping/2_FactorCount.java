
class FactorSum {

    static int factorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        // System.out.println("Factor sum is " + sum);
        return sum;
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        int n = Helper.inputNumber();

        int result = factorSum(n);
        System.out.println("Factor sum is " + result);

    }

}
