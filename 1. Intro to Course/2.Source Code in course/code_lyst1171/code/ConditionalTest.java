import  java.util.*;
class ConditionalTest
{

	public static void main(String[] args) {
		

		// taking input
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter first number :");
		int n1=ob.nextInt();


		System.out.println("Enter second number :");
		int n2=ob.nextInt();
		// finding out the max : conditional operator

		int max=n1>n2 ? n1: n2;

		System.out.println("Max value is "+max);




	}

}