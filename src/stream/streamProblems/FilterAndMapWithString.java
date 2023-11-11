package stream.streamProblems;

import java.util.Arrays;

// Given a list of strings, filter out the strings that contain the letter 'a', and transform
// the remaining strings to uppercase.
public class FilterAndMapWithString {
    public static void main(String[] args) {
        String[] fruits = new String[]{"apple", "banana", "orange", "grape", "kiwi", "cherry", "mango", "fig"};

        Object[] modifiedFruits = Arrays.stream(fruits)
                .filter(fruit -> !fruit.contains("a"))
//                .map(newFruit -> newFruit.toUpperCase())
                .map(String::toUpperCase)
//                .map(newFruit::toUpperCase())   // compilation error
                .toArray();

        System.out.println(Arrays.toString(modifiedFruits));
    }
}
