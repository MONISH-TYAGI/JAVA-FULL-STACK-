import java.util.Scanner;

public class Transpose {

    static int[][] transpose(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;

        int result[][] = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                result[i][j] = arr[j][i];
            }
        }

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int row = sc.nextInt();

        System.out.println("Enter cols: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        MultiplyMatrix.inputMatrix(matrix, "Matrix");

        MultiplyMatrix.printMatrix(matrix, "Original Matrix: ");

        int result[][] = transpose(matrix);

        MultiplyMatrix.printMatrix(result, "Transposed Matrix: ");

    }

}
