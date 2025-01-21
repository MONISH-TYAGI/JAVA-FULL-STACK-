import java.util.*;
class NegativePositiveZero
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number  ");
		int n1=scanner.nextInt();

		if(n1>0)
		{
			System.out.println("Number is positive number");
		}
		else if(n1<0)
		{
			System.out.println("Numhber is negative number");
		}
		else
		{
			System.out.println("Number is zero");
		}

	}
}