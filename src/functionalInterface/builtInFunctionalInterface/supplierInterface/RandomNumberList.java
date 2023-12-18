package functionalInterface.builtInFunctionalInterface.supplierInterface;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumberList {
    public static void main(String[] args) {
        // Using a Supplier to generate a list of 5 random numbers
        Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(100);

        List<Integer> randomNumbers = generateRandomNumberList(randomIntegerSupplier, 5);
        System.out.println("Random Numbers: " + randomNumbers);
    }

    private static List<Integer> generateRandomNumberList(Supplier<Integer> supplier, int count) {
        return IntStream.range(0, count)
                .mapToObj(i -> supplier.get())
                .collect(Collectors.toList());
    }
}

