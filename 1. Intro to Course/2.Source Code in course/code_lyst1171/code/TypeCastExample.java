class TypeCastExample
{
	public static void main(String[] args) 
	{
			byte b=10;

			// automatic  conversion
			short s=b;
			System.out.println("byte b "+b);
			System.out.println("short s "+s);

			long l=30L;
			float f=l;
			System.out.println("Float f "+f);


			// double ki value hai
			double d1=45.56;
			float f1=(float)d1;

			System.out.println("float value "+f1);

			// float ki value--> 4 bytes
			// convert karne ja raha hoon: long(8 bytes)


			float f2=12.23f;
			long l2=(long)f2;
			System.out.println("Long value "+l2);

	}
}