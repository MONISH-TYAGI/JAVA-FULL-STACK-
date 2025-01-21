class Magic {
    static int digitSum(int n) {
        int s = 0;
        while (n > 0) {
            s = s + (n % 10);
            n = n / 10;
        }
        return s;
    }

    public static void main(String[] args) {

        int n = Helper.inputNumber();

        int sum = 0;

        while (n > 0) {
            sum = digitSum(n);
            if (sum < 10)
                break;
            n = sum;
        }

        if (sum == 1) {
            System.out.println("Yes, Magic Number");
        } else {
            System.out.println("No, Not Magic Number");
        }

    }
}