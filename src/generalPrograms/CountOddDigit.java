package generalPrograms;

import java.util.Scanner;

// Count and print odd digits in a number
public class CountOddDigit {
    public static void countOdd(int num) {
        int rem;
        int count = 0;

        while(num != 0) {
            rem = num % 10;
            if(rem % 2 != 0) {
                System.out.println(rem);
                count++;
            }
            num /= 10;
        }
        System.out.println("Total odd digits are: " + count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        countOdd(num);
        input.close();
    }
}
