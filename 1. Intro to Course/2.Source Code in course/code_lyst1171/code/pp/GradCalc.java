import java.util.*;
class GradCalc
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// input physics marks
		System.out.println("Enter physics marks :");
		int phy=sc.nextInt();

		// input chemistry marks
		System.out.println("Enter chemistry marks :");
		int chem=sc.nextInt();

		// input math marks
		System.out.println("Enter math marks :");
		int math=sc.nextInt();

		// input biology marks
		System.out.println("Enter biology marks :");
		int bio=sc.nextInt();

		// input computer marks
		System.out.println("Enter computer marks :");
		int comp=sc.nextInt();

		int totalMarks=phy+chem+bio+math+comp;
		
		double percentage=(totalMarks/500.0)*100;

		System.out.println("percentage "+percentage+" %");

		// grading

		if(percentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=80 && percentage<90)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=70 && percentage<80)
		{
			System.out.println("Grade C");
		}
		else if(percentage>=60 && percentage<70)
		{
			System.out.println("Grade D");
		}
		else if(percentage>=40 && percentage<60)
		{
			System.out.println("Grade E");
		} 
		else
		{
			System.out.println("Grade F");
		}







	}	
}