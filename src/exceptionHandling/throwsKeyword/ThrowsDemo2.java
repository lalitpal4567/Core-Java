package exceptionHandling.throwsKeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThrowsDemo2 {
    public static void divide() throws ArithmeticException,InputMismatchException {
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        result = num1 / num2;
        System.out.println("the result is " + result);
    }

    public static void arithmeticHandler() throws InputMismatchException {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("pls don't divide by zero");
        }
    }
    public static void inputHandler() {
        try{
            arithmeticHandler();
        }
        catch(InputMismatchException i) {
            System.out.println("pls give only integer values ");
        }
    }

    public static void main(String[] args) {
        inputHandler();
    }
}
