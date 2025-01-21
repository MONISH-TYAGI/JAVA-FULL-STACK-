class CheckPrime {

    static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    static boolean checkPrime2(int n) {
        boolean flag = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;

    }

    public static void main(String[] args) {
        int n = Helper.inputNumber();
        if (checkPrime2(n)) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
