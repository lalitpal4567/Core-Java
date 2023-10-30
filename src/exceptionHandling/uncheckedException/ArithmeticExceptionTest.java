package exceptionHandling.uncheckedException;

public class ArithmeticExceptionTest {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        try{
            result = num1 / num2;   // throws ArithmeticException
        }catch(ArithmeticException e) {
            System.out.println("pls don't divide by zero");
        }

        System.out.println("the result is " + result);
    }
}
