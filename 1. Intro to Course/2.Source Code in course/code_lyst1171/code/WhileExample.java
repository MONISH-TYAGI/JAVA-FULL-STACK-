class WhileExample
{
	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 ....20
		// int trackingVariable=1;
		// while(trackingVariable<=20)
		// {
		// 	System.out.println("value of i "+trackingVariable);
		// 	// trackingVariable++;
		// 	trackingVariable=trackingVariable+1;
		// }

		// 20 ......1
		int tV=20;
		while(tV>=1)
		{
			System.out.print(tV+" ");
			tV--;
		}
		System.out.println();
		System.out.println("Loop terminated");


	}
}