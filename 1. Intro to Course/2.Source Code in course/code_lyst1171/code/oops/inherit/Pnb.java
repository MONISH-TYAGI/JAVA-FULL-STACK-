public class Pnb extends Bank {
    // getRateOfInterest ko override kiya jayega
    public int getRateOfInterest() {
        System.out.println("Rate of interest of PNB: " + 10);
        return 10;
    }
}
