package inner.classes;

public class AnonymousExample {

    public static void main(String[] args) {

        System.out.println("Creating Anonymous Class");

        Parent v1 = new Parent()
        {
            //body of the class

            int a = 40;

            int b = 20;

            public void test1() {
                System.out.println("test1 of anonymous class");
            }

            public void sum() {
                System.out.println("sum = " + (a + b));
            }


        };

        v1.test1();
        v1.sum();



        System.out.println("Creating anonymous class from abstract class");


        AbsClass v2 = new AbsClass() {
            public void m1() {
                System.out.println("anonymous implementation of m1()");
            }
        };

        v2.m1();
        v2.m2();


    }

}
