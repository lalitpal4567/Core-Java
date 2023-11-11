package stream.streamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, filter out strings with a length less than 5,
// and then transform the remaining strings to a list of their lengths.

public class FilterAndMapWithStringToLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi","fig","pomegranate");

        List<Integer> stringLength = words.stream()
                .filter(text -> text.length() > 5)
                .map(str -> str.length())
                .collect(Collectors.toList());

        stringLength.forEach(System.out::println);

    }
}
