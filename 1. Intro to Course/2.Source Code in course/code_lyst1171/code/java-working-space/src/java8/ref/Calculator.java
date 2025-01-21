package java8.ref;

public class Calculator {

    public Calculator(){
        System.out.println("Creating object of constructor");
    }
    public static void doCalculate()
    {
        System.out.println("do calculating..");
    }

    public void doCalculateNon(){
        System.out.println("this is non-static do calculate");
    }
}
