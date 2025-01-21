class InstanceExample
{
	// instance variable
	int x=50;
	double y;
	// single copy: for all objects
	static int n1=100;

	public static void main(String[] args) 
	{
		
		System.out.println("program started");
		// object karte hai
		InstanceExample ob=new InstanceExample();
		InstanceExample ob1=new InstanceExample();
		ob1.x=40;
		ob.x=10;
		System.out.println("ob.x "+ob.x);
		System.out.println("ob1.x "+ob1.x);
		System.out.println(ob.y);
		System.out.println(ob1.y);
		System.out.println(InstanceExample.n1);
		System.out.println(n1);
	

	}

	boolean a=true;
}

// default values by data type ki default value ko le leta hai.
