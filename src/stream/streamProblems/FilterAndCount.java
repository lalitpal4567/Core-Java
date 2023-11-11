package stream.streamProblems;

import java.util.Arrays;

// Given a list of strings, count the number of strings that have a length greater than 5.
public class FilterAndCount {
    public static void main(String[] args) {
        String[] words = new String[]{"apple", "banana", "orange", "grapefruit", "kiwi"};

        long count = Arrays.stream(words)
                .filter(text -> text.length() > 5)
                .count();

        System.out.println(count);
    }
}
