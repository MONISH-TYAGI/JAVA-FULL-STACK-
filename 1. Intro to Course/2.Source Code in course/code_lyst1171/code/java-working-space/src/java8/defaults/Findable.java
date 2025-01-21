package java8.defaults;

public interface Findable {
    void find();

    default void findingFail() {
        System.out.println("Default finding fail");
    }

    default void findDefault() {
        System.out.println("Finding Object");
    }

    static void printTest() {
        System.out.println("this is printing method from interfaces");
    }

    static void main(String args[]) {
        System.out.println("main inside interface");
    }

}
