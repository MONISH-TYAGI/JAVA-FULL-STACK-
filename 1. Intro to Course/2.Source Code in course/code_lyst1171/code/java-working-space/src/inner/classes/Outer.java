package inner.classes;

public class Outer {

    int x=10;
    static int y=40;

    static class Inner{

        int a=40;

        public void innerM1(){
            System.out.println("value of a "+a);
            System.out.println("Outer static y = "+y);
//            System.out.println("Outer non static x "+x);
        }

    }
}
