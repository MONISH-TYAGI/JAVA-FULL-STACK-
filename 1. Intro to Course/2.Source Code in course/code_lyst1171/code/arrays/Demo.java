class Demo
{
	public static void main(String[] args) {
		

		// int ka array banane ja rhe hai:
		int marksArray[]={ 89, 90, 40, 77, 85 };

		int length=marksArray.length ;

		System.out.println("length of marksArray "+length);

		// double marksInDecimal[]; //declaration
		// marksInDecimal=new double[5];//initilization

		double[] marksInDecimal=new double[5];

		System.out.println("length of marksin Decimal "+marksInDecimal.length);	

		System.out.println("accessing array values");

		System.out.println(marksArray[1]);//90	
		System.out.println(marksArray[3]);//77

		System.out.println(marksArray[0]+marksArray[3]);

		System.out.println("accessing all array values using simple loop");

		for(int i=0 ; i<marksArray.length;i++)
		{
			System.out.println(marksArray[i]);
		}
		

		System.out.println("Accessing array without values");
		for(int i=0;i<marksInDecimal.length;i++)
		{
			System.out.println(marksInDecimal[i]);
		}

		marksInDecimal[0]=99.1;
		marksInDecimal[4]=12.5;



		for(int i=0;i<marksInDecimal.length;i++)
		{
			System.out.println(marksInDecimal[i]);
		}




	}
}