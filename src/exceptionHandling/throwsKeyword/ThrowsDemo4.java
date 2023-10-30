package exceptionHandling.throwsKeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo4 {
    public static void methodCaller() {
        try{
            findDivide();
        }
        catch(ArithmeticException e) {
            System.out.println("This is Arithmetic exception in methodcaller.");
        }
        catch(InputMismatchException e) {
            System.out.println("This is InputMismatchException in methodCaller.");
        }
    }
    public static void findDivide(){ // throws ArithmeticException, InputMismatchException
        int num1 = 5;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        methodCaller();
    }
}
