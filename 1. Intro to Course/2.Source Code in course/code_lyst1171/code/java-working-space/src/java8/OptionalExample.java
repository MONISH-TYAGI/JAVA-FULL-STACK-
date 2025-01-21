package java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {


//        create:
        Optional<String> empty = Optional.empty();
        Optional<String> stringOptional = Optional.ofNullable("Durgesh is working hard to complete this course");
        Optional<String> nullableOptional = Optional.ofNullable(null);

        nullableOptional.ifPresent(value -> System.out.println("Value is " + value));
        String value = stringOptional.orElseThrow(() -> new RuntimeException("this value is empty"));
        System.out.println(value);

        nullableOptional.ifPresentOrElse(
                valueOn -> {
                    System.out.println("value is present");
                    System.out.println(valueOn);
                },
                () -> {
                    System.out.println("no value is present");
                }
        );

        /*

        //        accessor methods
         get()- return value if present otherwise: NoSuchElementException
         orElse(default value)- return value if value is present otherwise default value
        orElseGet(supplier)- return value if present otherwise invoke supplier
        orElseThrow(exceptionSupplier)-
        ifPresent(consumer)
        ifPresentOrElse(lamda1, lambda2)
         */


    }
}
