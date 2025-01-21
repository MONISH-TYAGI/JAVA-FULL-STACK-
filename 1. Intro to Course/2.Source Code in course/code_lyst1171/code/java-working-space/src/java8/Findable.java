package java8;

@FunctionalInterface
public interface Findable
{
    void find();

    public static void testMethod(){
        System.out.println("static method in interface");
    };

    default  void defaultTestMethod(){
        System.out.println("this is default method");
    }



}
