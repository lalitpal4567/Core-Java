package exceptionHandling.uncheckedException;

import java.util.InputMismatchException;
import java.util.Scanner;

class ArithmeticException2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num1 = 5;
        int num2 = 0;
        int result = 0;

        try{
            result = num1 / num2;
            String s = null;
            System.out.println(s.length());
        }
        catch(ArithmeticException a) {
            System.out.println("ArithmeticException");
        }
        catch(InputMismatchException i) {
            System.out.println("pls don't give no. other than int");
        }
        catch(NullPointerException ne) {
            System.out.println("NullPointerException occurred");
        }
        finally {
            System.out.println("the result is " + result);
        }

        System.out.println("i will not execute ");
        System.out.println("i will not execute ");
    }
}
