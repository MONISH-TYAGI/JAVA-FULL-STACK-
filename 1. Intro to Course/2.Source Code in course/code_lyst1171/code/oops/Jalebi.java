public class Jalebi {

    // variables
    int price;
    String name;

    // constructor-invoked automatically- jab object create hoga

    // objects create karte samay hi--- values initialize kar denge
    public Jalebi(int p, String n) {
        System.out.println("This is constructor");
        price = p;
        name = n;
    }

    // methods
    public void showPrice() {
        System.out.println("Price is " + price);
    }

    public void displayAll() {
        System.out.println("Price : " + price);
        System.out.println("Name : " + name);
    }

}
