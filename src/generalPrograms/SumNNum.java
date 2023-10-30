package generalPrograms;

import java.util.Scanner;

// sum of numbers within a range
public class SumNNum {
    public static int sumNumber(int range) {
        int sum = 0;
        for(int i = 0; i <= range; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range:  ");
        int range = input.nextInt();
        System.out.println("Sum of " + range + " is: " + sumNumber(range));
        input.close();
    }
}
