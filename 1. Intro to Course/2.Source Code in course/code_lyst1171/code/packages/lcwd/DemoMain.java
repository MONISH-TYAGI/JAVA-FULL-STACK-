package lcwd; 
public  class DemoMain{
	public static void main(String[] args) {
		System.out.println("Demo main started");
		p2.Aloo aloo=new p2.Aloo();
		p1.Samosa s1=new p1.Samosa(aloo);
		s1.createSamosa();
	}
}