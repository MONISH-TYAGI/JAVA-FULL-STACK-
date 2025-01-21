import java.util.Scanner;

public class CheckIdentity {
    static boolean checkIdentityMatrix(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        if (row != col)
            return false;

        boolean flag = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    // diagonal pe hai
                    if (arr[i][j] != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    // kisi aur element pe hai
                    if (arr[i][j] != 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (!flag) {
                break;
            }
        }

        return flag;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows ");
        int row = sc.nextInt();

        System.out.println("Enter cols: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        MultiplyMatrix.inputMatrix(matrix, "Matrix ");

        MultiplyMatrix.printMatrix(matrix, "Original Matrix: ");

        boolean result = checkIdentityMatrix(matrix);
        if (result) {
            System.out.println("Matrix is Identity");
        } else {
            System.out.println("Matrix is not identity");
        }

    }
}
