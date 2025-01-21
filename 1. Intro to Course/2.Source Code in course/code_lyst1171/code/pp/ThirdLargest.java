import java.util.Scanner;

public class ThirdLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // taking input
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // false==> array is sorted:
        // swape need hogi to hame flag = true
        boolean flag = false;
        // sorting ...logic
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }

            if (flag == false) {
                System.out.println("Array  is sorted");
                break;
            }

        }

        System.out.println("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Third Largest Element : " + arr[arr.length - 3]);

    }
}
