public class Pepsi {
    // instance variable
    double price = 30;
    String brand = "B1";

    // method
    // constructor

    public Pepsi() {

        // constructor calling--it must be the first line
        this(30.98, "Cocacola");

        System.out.println("Zero Arg constructor");
        System.out.println("Creating object");
        System.out.println("Wow its amazing wor");

        // local variable
        // double price = 15;
        // // local variables--print
        // System.out.println("Price of Pepsi is " + price);
        // System.out.println("Price of pepsi is " + this.price);
        // System.out.println("Brand " + this.brand);
        // this.display();

    }

    public Pepsi(double price, String brand) {
        System.out.println("Two arg constructor");
        this.price = price;
        this.brand = brand;
    }

    public Pepsi display() {
        System.out.println("Price : " + price);
        System.out.println("Brand : " + this.brand);
        System.out.println("display() " + this);
        Drinker drinker = new Drinker();
        drinker.drink(this);
        return this;

    }

    public Pepsi m1() {
        System.out.println("m1() method");
        return this;

    }

    public Pepsi m2() {
        System.out.println("m2() method ");
        return this;
    }

    public Pepsi m3() {
        System.out.println("m3() method ");
        return this;
    }

    public Pepsi m4() {
        System.out.println("m4() method");
        return this;
    }

    public static void main(String[] args) {

        // method chaining--> this keywords
        Pepsi pepsi1 = new Pepsi().m1().m2().m3().m4().display();

        // System.out.println("Object Created");
        // pepsi1.display();
        // System.out.println(pepsi1);

        // Pepsi pepsi2 = new Pepsi(90.23, "MakeItDrink");

        // pepsi2.display();
        // System.out.println(pepsi2);

    }

}
