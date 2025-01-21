import java.util.Scanner;

public class Frequency2 {
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


        // few elements to count the frequency
        int visited=-1;
        int frequencies[]=new int[arr1.length];

        for(int i=0;i<arr1.length;i++)
        {
            int element=arr1[i];//2
            int count=1;
            for(int j=i+1;j<arr1.length;j++)
            {
                    int element2=arr1[j];
                    if(element==element2)
                    {
                            count++;
                            frequencies[j]=visited;
                    }
            }
            if(frequencies[i]!=visited)
            {
                frequencies[i]=count;
                count=0;
            }


        }

        System.out.println("Frequency Count : ");
        for(int i=0;i<arr1.length;i++)
        {
            if(frequencies[i]!=visited)
            {
                System.out.println(arr1[i]+" : "+frequencies[i]);
            }
        }


    }
}
