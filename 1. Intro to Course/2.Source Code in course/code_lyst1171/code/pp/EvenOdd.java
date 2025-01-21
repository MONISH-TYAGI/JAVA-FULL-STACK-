import java.util.*;
class EvenOdd
{
	public static void main(String[] args) 
	{
			System.out.println("Enter number: ");
			Scanner scanner=new Scanner(System.in);
			int n=scanner.nextInt();

			

			if(n%2==0)			
				System.out.println("Number is even");
			
			else 			
				System.out.println("Number is odd");
			

	}	
}