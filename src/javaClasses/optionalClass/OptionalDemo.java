package javaClasses.optionalClass;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> option = Optional.of("hello world");
        String str = option.get();
        System.out.println(str);

        System.out.println(option.isPresent());

    }
}
