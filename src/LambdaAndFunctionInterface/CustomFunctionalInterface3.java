package LambdaAndFunctionInterface;

@FunctionalInterface
interface MathOperation2 {
    int operate(int a, int b);
}

public class CustomFunctionalInterface3 {
    public static void main(String[] args) {
        // Addition operation
        MathOperation2 addition = (a, b) -> a + b;
        System.out.println("Addition: " + performOperation(5, 3, addition));

        // Subtraction operation
        MathOperation2 subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + performOperation(8, 4, subtraction));

        // Multiplication operation
        MathOperation2 multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + performOperation(6, 2, multiplication));

        // Division operation
        MathOperation2 division = (a, b) -> (b != 0) ? a / b : 0;
        System.out.println("Division: " + performOperation(10, 2, division));
        System.out.println("Division by zero: " + performOperation(10, 0, division));

        // Custom operation: Square of a number
        MathOperation2 square = (a, b) -> a * a;
        System.out.println("Square of 7: " + performOperation(7, 0, square));

        // Custom operation: Cube of a number
        MathOperation2 cube = (a, b) -> a * a * a;
        System.out.println("Cube of 4: " + performOperation(4, 0, cube));

        // Custom operation: Maximum of two numbers
        MathOperation2 max = (a, b) -> Math.max(a, b);
        System.out.println("Maximum of 12 and 8: " + performOperation(12, 8, max));
    }

    private static int performOperation(int a, int b, MathOperation2 operation) {
        return operation.operate(a, b);
    }
}

