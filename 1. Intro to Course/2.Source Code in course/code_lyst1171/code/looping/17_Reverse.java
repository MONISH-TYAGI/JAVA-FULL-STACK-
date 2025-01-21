class Reverse {

    static void reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        System.out.println("Reverse Number " + rev);
    }

    public static void main(String[] args) {

        int n = Helper.inputNumber();
        reverse(n);

    }
}
