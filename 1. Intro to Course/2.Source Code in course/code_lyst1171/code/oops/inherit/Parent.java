public class Parent {
    String name;
    String address;

    public Parent(String name, String address) {
        System.out.println("parent constructor");
        this.name = name;
        this.address = address;
    }

    public void show() {
        System.out.println(name);
        System.out.println(address);
        System.out.println("==========");
    }
}
