package stream.streamProblems;

import java.util.Arrays;
import java.util.Optional;

// Given a list of strings, find the first string that starts with the letter "b".
public class FilterAndFind {
    public static void main(String[] args) {
        String[] words = new String[] {"apple", "banana", "orange", "grape"};

        Optional<String> first = Arrays.stream(words)
                .filter(value -> value.startsWith("b"))
                .findFirst();

        System.out.println(first.isPresent());  // false

        if(first.isPresent())
            System.out.println(first.get());
        else System.out.println("not found");

    }
}
