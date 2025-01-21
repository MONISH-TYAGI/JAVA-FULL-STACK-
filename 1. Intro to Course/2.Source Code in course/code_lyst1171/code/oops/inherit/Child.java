public class Child extends Parent {

    String name;
    String anotherAddress;

    public Child(String name, String anotherAddress, String parentName, String parentAddress) {
        // parent class constructor
        // super() call must be the first line of child class constructor
        super(parentName, parentAddress);
        System.out.println("child classs constructor called");
        this.name = name;
        this.anotherAddress = anotherAddress;

    }

    public void displayAll() {
        // String anotherAddress = "test";
        String name = "local name";

        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(super.address);
        System.out.println(this.anotherAddress);

        super.show();

    }

}
