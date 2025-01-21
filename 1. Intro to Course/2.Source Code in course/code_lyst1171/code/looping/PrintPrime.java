public class PrintPrime {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (CheckPrime.checkPrime2(i)) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();

    }
}
