import java.util.Scanner;

public class SumArray {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the size of array");
        Scanner ob=new Scanner(System.in);

        int size=ob.nextInt();

        // creating array
        int arr[]=new int[size];

        System.out.println("Enter the elements one by one");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ob.nextInt();
        }

        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of an array is "+sum);


    }
}
