import java.util.*;
class SalaryCalc2
{

	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		int basicSalary=scanner.nextInt();
		double grossSalary=0.0;
		int hra=0;
		int da=0;
		if(basicSalary<=10000)
		{
				hra=20;
				da=80;
		}
		else if(basicSalary<=20000 && basicSalary >10000)
		{
				hra=25;
				da=90;
		}
		else
		{
				hra=30;
				da=95;
		}

		grossSalary=basicSalary+((hra/100.0)*basicSalary)+((da/100.0)*basicSalary);
		
		System.out.println("Gross Salary = "+grossSalary);


	}
}