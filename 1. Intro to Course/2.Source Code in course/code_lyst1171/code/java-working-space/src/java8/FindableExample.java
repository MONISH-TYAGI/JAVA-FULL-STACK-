package java8;

public class FindableExample    {
    public static void main(String[] args) {

        Findable findable=()->{
            System.out.println("This is find method body");
        };

        findable.find();
        findable.defaultTestMethod();

        Findable.testMethod();

        System.out.println("____________");
        MyInter myInter=Samosa.createSamosa(()->{
            System.out.println("this is implementation of findable while creating samosa");
        });

        myInter.myMethod();


    }
}
