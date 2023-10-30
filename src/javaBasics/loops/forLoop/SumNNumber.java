package javaBasics.loops.forLoop;

import java.util.Scanner;

public class SumNNumber {
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
        System.out.print("Sum of "+range+" is: "+sumNumber(range));
        input.close();
    }
}
