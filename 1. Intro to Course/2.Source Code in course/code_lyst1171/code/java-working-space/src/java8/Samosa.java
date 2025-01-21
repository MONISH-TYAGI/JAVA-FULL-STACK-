package java8;

public class Samosa {
    public static MyInter createSamosa(Findable findable) {
        System.out.println("inside create RSamosa method");
        findable.find();
        System.out.println("Creating samosa");

        return ()->{
            System.out.println("implementation of myinter from create samosa");
        };

    }
}
