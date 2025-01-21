import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        // creating array
        int arr1[]=new int[size];

        System.out.println("Enter the elements one by one");

        // input elements
        for(int i=0;i<arr1.length;i++)
        {
            int input=sc.nextInt();
            arr1[i]=input;
        }

        // rotate the array
        int first=arr1[0];
        for(int i=0;i<arr1.length-1;i++)
        {
            arr1[i]=arr1[i+1];

        }

        arr1[arr1.length-1]=first;

        System.out.println("Rotated Array");
        for(int x:arr1)
        {
            System.out.print(x+" ");
        }
        System.out.println();



    }
}
