package java8.old;

import java8.MyInter;

public class MyInterImpl implements MyInter {
    @Override
    public void myMethod() {
        System.out.println("this is implementation of my inter");
    }

    public static void main(String[] args) {


//        anonymous class
        MyInter myInter=new MyInter() {
            @Override
            public void myMethod() {
                System.out.println("implementation using anonymous class");
            }
        };

    }
}
