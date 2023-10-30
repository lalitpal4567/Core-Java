package generalPrograms;

import java.util.Scanner;

// factorial using for loop
public class Factorial2 {
    public static int findFactorial(int num) {
        int product = 1;

        for(int i = num; i > 0; i--) {
            product *= i;
        }

        // for(int i = 1; i <= num; i++){
        //     product *= i;
        // }

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
