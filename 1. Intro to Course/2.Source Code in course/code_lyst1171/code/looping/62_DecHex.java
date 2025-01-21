class DecHex {

    public static void main(String[] args) {

        int n = Helper.inputNumber();

        String hexNumber = "";
        while (n > 0) {
            int r = n % 16;

            char ch = (char) (r < 10 ? '0' + r : 'A' + r % 10);
            System.out.println(ch);
            hexNumber = ch + hexNumber;
            n = n / 16;

        }
        System.out.println("Hexa Number: " + hexNumber);

    }

}
