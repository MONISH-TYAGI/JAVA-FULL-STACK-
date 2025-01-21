class PerfectNumber {

    static boolean checkPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int n = Helper.inputNumber();
        boolean result = checkPerfectNumber(n);
        if (result) {
            System.out.println("Yes, It is Perfect Number");

        } else {
            System.out.println("No, It is not Perfect Number ");

        }
    }

}
