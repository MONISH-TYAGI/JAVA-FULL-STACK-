import java.util.Scanner;
public class Demo
{

    public static void main(String[] args) {
        
       
        // taking input 
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();

        // create array of give size
        int arr[]=new int[size];

        // taking input to array
        System.out.println("Enter array elements one by one");

        for(int i=0;i<arr.length;i++)
        {
            int element=sc.nextInt();
            arr[i]=element;
        }

        // printing array elements
        System.out.println("Output ");
        System.out.println("Array size = "+arr.length);
        for(int x:arr)
        {
            System.out.println(x);
        }


        


    }

}
