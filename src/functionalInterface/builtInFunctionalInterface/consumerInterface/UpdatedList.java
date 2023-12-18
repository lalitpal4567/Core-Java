package functionalInterface.builtInFunctionalInterface.consumerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UpdatedList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David"));

        // Using a Consumer to update each name by appending " - Updated"
        Consumer<String> updateConsumer = name -> name += " - Updated";
        names.forEach(updateConsumer);

        // Print the updated names
        names.forEach(System.out::println);
    }
}

