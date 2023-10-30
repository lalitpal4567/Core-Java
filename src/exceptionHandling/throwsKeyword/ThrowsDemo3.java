package exceptionHandling.throwsKeyword;

public class ThrowsDemo3 {
    public static void methodCaller() {
        try {
            findDivide();
        } catch (ArithmeticException e) {
            System.out.println("in methodCaller method Arithmetic exception");
        }
    }
    public static void findDivide(){ // throws ArithmeticException, InputMismatchException{

        int num1 = 4;
        int num2 = 0;

        int result = num1 / num2;
            System.out.println(result);

    }

    public static void main(String[] args) {
        try{
            methodCaller();
        }
        catch(Exception e) {
            System.out.println("in main method InputMismatchException");
        }
    }
}

// Note* : public static void findDivide() // throws ArithmeticException, InputMismatchException
// It is not necessary to use throws keyword as a method signature because this is unchecked exception
// compiler automatically puts throws keyword here. In case of unchecked exception this is optional.
