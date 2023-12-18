package functionalInterface.builtInFunctionalInterface.supplierInterface;

import java.util.UUID;
import java.util.function.Supplier;

public class UniqueIdentifier {
    public static void main(String[] args) {
        // Using a Supplier to generate a unique identifier (UUID)
        Supplier<String> uniqueIdentifierSupplier = () -> UUID.randomUUID().toString();

        String uniqueId = uniqueIdentifierSupplier.get();
        System.out.println("Unique Identifier: " + uniqueId);
    }
}

