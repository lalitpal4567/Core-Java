package functionalInterface.builtInFunctionalInterface.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Example 1: Printing elements of a list using a Consumer
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grape", "Kiwi");

        // Using a Consumer to print each element
        Consumer<String> printConsumer = fruit -> System.out.println(fruit);
        fruits.forEach(printConsumer);

        System.out.println(); // Blank line for separation

        // Example 2: Modifying elements of a list using a Consumer
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using a Consumer to square each element
        Consumer<Integer> squareConsumer = number -> System.out.print(number * number + " ");
        numbers.forEach(squareConsumer);
    }
}

