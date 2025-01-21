class PythaTriple {

    public static void main(String[] args) {

        int n = Helper.inputNumber();

        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j <= n; j++) {

                int c = (int) Math.sqrt((i * i) + (j * j));

                if (c <= n && ((c * c) == ((i * i) + (j * j)))) {
                    System.out.print(i + " , " + j + " , " + c);
                    System.out.println();
                }

            }
        }

    }
}
