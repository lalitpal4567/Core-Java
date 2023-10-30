package exceptionHandling.throwNewKeyword;

public class ThrowDemo3 {
    public static void main(String[] args) {
        try {
            double x= 3 / 1;
            System.out.println("Value of x: "+x);
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
