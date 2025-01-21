class Power {

    public static void main(String[] args) {

        int x = Helper.inputNumber();
        int y = Helper.inputNumber();
        int p = 1;

        for (int i = 1; i <= y; i++) {
            p = p * x;
        }
        System.out.println("Result : " + p);

    }
}
