import java.util.*;
class MaxTwo
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number n1: ");
		int n1=scanner.nextInt();

		System.out.println("Enter number n2: ");
		int n2=scanner.nextInt();

		if(n1>n2)
	
			System.out.println(n1+" N1 is max");
	
		else 
	
			System.out.println(n2+" N2 is max");
	
	}
}