package java8.annotation;

import lombok.NonNull;

public class TypeAnnotationExample {

    public static void printData( @NonNull Object o ){
        System.out.println(o.toString());
    }
    public static void main(String[] args) {


        @NonNull String str = null;

        printData(null);


    }
}
