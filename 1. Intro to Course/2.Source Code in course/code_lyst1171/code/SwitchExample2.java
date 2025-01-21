import java.util.*;
class SwitchExample2
{
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter day number :");
		int n=scanner.nextInt();
		String day="";
		switch (n) 
		{

		case 1:
			System.out.println("MON");
			day="mon";
			break;
		case 2:
			System.out.println("Tue");
			day="tue";
			break;
		case 3:
			System.out.println("Wed");
			day="wed";
			break;
		case 4:
			System.out.println("Thu");
			day="thu";
			break;
		case 5:
			System.out.println("Fri");
			day="fri";
			break;
		case 6:
			System.out.println("Sat");
			day="sat";
			break;
		case 7:
			System.out.println("sun");
			day="sun";
			break;
		default:
			System.out.println("Invalid day number");

					
		}

	}
}