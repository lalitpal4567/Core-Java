package functionalInterface.builtInFunctionalInterface.supplierInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Using a Supplier to generate a random number
        Supplier<Double> randomNum = () -> Math.random();

        // // Using a Supplier to provide a constant value
        Supplier<String> constantValue = () -> "hello";

        System.out.println(randomNum.get());
        System.out.println(constantValue.get());
    }
}
