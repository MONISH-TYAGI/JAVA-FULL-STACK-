import java.util.*;
class SwitchExample
{
	public static void main(String[] args) 
	{
		// ex:1
		// 1-->one
		// 2-->two
		// 3-->three
		// 4-->four
		// 5-->five
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		long n=scanner.nextLong();

		switch(n)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid Number !!");
			break;





		}

		
	}
}