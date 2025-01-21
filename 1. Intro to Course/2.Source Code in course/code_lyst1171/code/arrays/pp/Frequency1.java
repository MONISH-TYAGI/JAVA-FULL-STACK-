import java.util.Scanner;

public class Frequency1 {
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

        // array with elements
        // 0....9 tak ke hi elements ko  dala gya hai array mein
        System.out.println("Frequency Count");
        for(int i=0;i<=9;i++)
        {
            int count=0;
            for(int j=0;j<arr1.length;j++)
            {
                if(i==arr1[j])                
                    count++;
               
            }
            if(count>0)
            {
                System.out.println(i+" : "+count);
                count=0;
            }
        }

    }
}
