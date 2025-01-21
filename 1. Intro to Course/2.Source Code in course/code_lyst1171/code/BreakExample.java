class BreakExample
{
	public static void main(String[] args) {


		for(int i=1;i<=5;i++)
		{
			if(i==4)
			{
				System.out.println("loop is at 4");
				break;
			}
			System.out.println("value of i = "+i);
		}

		System.out.println("outside loop");

	}
}