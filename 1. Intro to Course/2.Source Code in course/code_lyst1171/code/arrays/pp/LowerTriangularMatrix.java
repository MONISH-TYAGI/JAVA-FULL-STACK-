import java.util.Scanner;

public class LowerTriangularMatrix {

    static void changeToLowerMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();

        int matrix[][] = new int[size][size];

        MultiplyMatrix.inputMatrix(matrix, "matrix ");
        MultiplyMatrix.printMatrix(matrix, "orignial Matrix:");
        changeToLowerMatrix(matrix);
        MultiplyMatrix.printMatrix(matrix, "Lowertriangle Matrix:");

    }

}
