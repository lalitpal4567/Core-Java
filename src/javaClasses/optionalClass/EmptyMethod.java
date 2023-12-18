package javaClasses.optionalClass;

import java.util.Optional;

public class EmptyMethod {
    public static void main(String[] args) {
        Optional <String> optional = Optional.empty();

//        System.out.println(optional);   // Optional.empty
//        System.out.println(optional.get());     // NoSuchElementException (No value present)

        if(optional.isPresent())    // false
            System.out.println("value is present: " + optional.get());
        else
            System.out.println("not found");

        optional.ifPresent(value -> System.out.println(value)); // will not run
    }
}
