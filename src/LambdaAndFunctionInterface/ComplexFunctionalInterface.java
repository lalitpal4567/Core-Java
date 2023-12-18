package LambdaAndFunctionInterface;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FilterCondition<T> {
    boolean test(T element);
}

public class ComplexFunctionalInterface {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("grape");
        words.add("watermelon");

        // Using a lambda expression to implement the abstract method
//        FilterCondition<String> startsWithB = (str) -> str.startsWith("b");
        FilterCondition<String> lengthGreaterThanFive = (str) -> str.length() > 5;

        // Filtering elements based on conditions
//        List<String> bWords = filter(words, startsWithB);
        List<String> bWords = filter(words, str -> str.length() > 5);
        List<String> longWords = filter(words, lengthGreaterThanFive);

        // Displaying the results
        System.out.println("Words starting with 'b': " + bWords);
        System.out.println("Words with length greater than five: " + longWords);
    }

    private static <T> List<T> filter(List<T> list, FilterCondition<T> condition) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (condition.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}

