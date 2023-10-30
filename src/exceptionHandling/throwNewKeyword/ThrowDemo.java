package exceptionHandling.throwNewKeyword;

public class ThrowDemo {
    public static void main(String[] args) {
        int num = -1;

        if(num >= 0) {
            System.out.println("Number is positive.");
        } else {
            throw new ArithmeticException(); // java.lang.ArithmeticException.ArithmeticException()
            // throw new ArithmeticException("Number is negative");  // java.lang.ArithmeticException.ArithmeticException(String s)
        }
    }
}
