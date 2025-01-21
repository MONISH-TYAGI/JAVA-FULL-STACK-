import java.util.Scanner;

public class ReverseArray {
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

        System.out.println("Reverse Array");
        // print the reverse of arr1
        for(int i=arr1.length-1;i>=0;i--)
        {
            System.out.print(arr1[i]+" ");
        }

        System.out.println();


      

    }
}
