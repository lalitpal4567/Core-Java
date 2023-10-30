package generalPrograms;

import java.util.Scanner;

// count no. of 1's in a number
public class CountOnes {
    public static int countHigh(int binary) {
        int sum = 0;
        int rem;
        int count = 0;

        while(binary != 0) {
            if(binary % 10 == 1) {
                count++;
            }
            binary /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = input.nextInt();

        System.out.print("Number of 1s in " + binary + " is: " + countHigh(binary));
    }
}

