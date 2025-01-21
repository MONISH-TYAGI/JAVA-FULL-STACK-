package p1; 

public class Samosa
{
	p2.Aloo aloo;

	public Samosa(p2.Aloo aloo){
		System.out.println("Creating Samosa");
		this.aloo=aloo;
	}

	public void createSamosa(){
		aloo.getColor();
		System.out.println("Creating Samosa");
		System.out.println("Samosa Created");	

	}
}