import java.util.*;
class DivBy5And11
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number  ");
		int n1=scanner.nextInt();

		
		if((n1%5==0) && (n1%11==0))
		{
			System.out.println("Number is divisible by both 5 and 11");
		}
		else
		{
			System.out.println("Number is not divisible by both 5 and 11");
		}
	}	
}