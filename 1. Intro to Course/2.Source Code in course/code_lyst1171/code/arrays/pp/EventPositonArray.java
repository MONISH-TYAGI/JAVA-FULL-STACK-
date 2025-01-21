import java.util.Scanner;

public class EventPositonArray {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        int arr[]=new int[s];     
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        // elements at event position

        System.out.println("Element at event position");
        for(int i=0;i<arr.length;i++)
        {
            // i //position
            // arr[i] //element
            if(i%2==0)
            {
                System.out.print(arr[i]+ " ");
            }

        }
        System.out.println();


    }
}
