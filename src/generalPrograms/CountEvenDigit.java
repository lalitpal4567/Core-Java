package generalPrograms;

import java.util.Scanner;

// Count and print even digits in a number.
public class CountEvenDigit {
    public static void countEven(int num) {
        int rem;
        int count=0;

        while (num != 0) {
            rem = num % 10;

            if(rem % 2 == 0) {
                System.out.println(rem);
                count++;
            }
            num /= 10;
        }
        System.out.println("Total even digits are: " + count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        countEven(num);
        input.close();
    }
}
