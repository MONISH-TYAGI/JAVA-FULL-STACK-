class LiteralExample
{
	public static void main(String[] args)
	{
		boolean result=false ;
		char ch='A';
		int i=100;
		String str="LCWD";
		System.out.println(ch);
		System.out.println(result);
		System.out.println(i);
		// integer literal
		byte n1=12;
		short n2=4444;
		int n3=35252;
		long n4=25252L;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

		// 

		// base 10
		int valueDec=26;

		// base 16
		// prefix--0x [Hex Decimal 0-9,A-F]
		int valueHex=0x1A;

		// base 2
		// prefix-0b [Binary 0,1]
		int valueBin=0b11010;
		System.out.println(valueDec);
		System.out.println(valueHex);
		System.out.println(valueBin);

		// 1001
		// dec
		// hex
		// binary

		// Floting Point Literals 
		// float-- point ke baad : max 7

		float f=1313.3124252524f;
		// double --point ke baad max 16
		double d=3235.12345678987654D;
		double d1=235.235;

		System.out.println(f);
		System.out.println(d);
		System.out.println(d1);

		float f1=2.3f;
		double d3=1.23e2;
		// 1.23x10pow2
		System.out.println(d3);


		// character literals
		// 'A','\u0000','\f0000'
		char ch1='R';
		char ch2='!';
		char ch3='\u0000';
		char ch4='\u00F1';
		char ch5='\0';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		// System.out.println(ch4);
		System.out.println(ch5);

		System.out.println("hi "+'\t'+" how are you");
		// \t tab space
		// \n newline
		// \f formfeed
		// \r carriage return
		// \" double quote
		// \' single quote

		// String literal:

		String name="substring";
		String test=null;


		// -------------------------
		long debiteCardNumber=1212_2323_3434_3532L;
		System.out.println(debiteCardNumber);
		float pi=3.14_15F;
		long hexValue=0xFF_EC_DE;
		int binValue=0b11_11_10;
		System.out.println(pi);
		System.out.println(hexValue);
		System.out.println(binValue);

		










	}
}