import java.util.Scanner;

class Factors {

    static void printFactors(int n) {

        System.out.println("Factors: ");
        for (int i = 1; i <= n; i++) {

            // check karna hai -->
            // kya n ko i divide kar rha hai
            if (n % i == 0) {
                //
                System.out.print(i + "\t");
            }

        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        printFactors(n);

    }
}
