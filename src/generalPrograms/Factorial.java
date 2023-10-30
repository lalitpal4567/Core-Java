package generalPrograms;

import java.util.Scanner;

// factorial using while loop
public class Factorial {
    public static int findFactorial(int num) {
        int product = 1;

        while(num != 0) {
            product *= num;
            num--;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Factorial of " + num + " is: " + findFactorial(num));
        input.close();
    }
}
