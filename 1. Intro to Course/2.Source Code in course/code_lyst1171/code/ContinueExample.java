class ContinueExample
{
	public static void main(String[] args) {


		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				System.out.println("loop is at 3");
				continue;
			}
			System.out.println("Welcome "+i);
			System.out.println("How are you "+i);
			System.out.println("I am fine "+i);
		}

		System.out.println("outside loop");

	}
}