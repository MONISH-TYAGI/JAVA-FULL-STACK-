import java.util.ArrayList;
class ForEach
{
	public static void main(String[] args) {
		
		int arr[]={123,124,1242,35,346};

		// accessing using for each loop
		for(int x:arr)
		{
			System.out.println("value of x = "+x);
		}

		String names[]={"ankit","sachin","surya","rahul"};

		for(String name:names)
		{
			System.out.println(name);
		}

		// 
		ArrayList<Integer> list=new ArrayList();
		list.add(124);
		list.add(2345);

		for(int y:list)
		{
			System.out.println(y);
		}


	}
}