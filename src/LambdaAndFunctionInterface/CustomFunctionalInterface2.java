package LambdaAndFunctionInterface;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class CustomFunctionalInterface2{
    public static void main(String[] args) {
        // Addition operation
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + performOperation(5, 3, addition));

        // Subtraction operation
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + performOperation(8, 4, subtraction));

        // Multiplication operation
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + performOperation(6, 2, multiplication));

        // Division operation
        MathOperation division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
        };
        System.out.println("Division: " + performOperation(10, 2, division));
        System.out.println("Division by zero: " + performOperation(10, 0, division));
    }

    private static int performOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}

