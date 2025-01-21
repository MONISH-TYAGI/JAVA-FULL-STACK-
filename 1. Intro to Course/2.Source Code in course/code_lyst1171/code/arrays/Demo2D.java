class Demo2D
{
	public static void main(String[] args) 
	{
		
		// 2d array : 
		// 1. hame values pata hai
		int arr[][]= { 
			{ 4,9,10,30 },
			{ 6,8,5,30 },
			{ 2,3,1,30},
			{ 11,8,2,30} 
		};

		// 2D array print karne ka tareeka
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[0].length-1;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();


		}

		// 2. jab hme values nhi pata ho
		int  arr1[][]=new int[4][3];
		System.out.println("Printing second array");
		arr1[0][0]=500;

		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[0].length-1;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();


		}

		

	}
}