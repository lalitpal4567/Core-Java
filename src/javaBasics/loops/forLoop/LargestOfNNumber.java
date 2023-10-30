package javaBasics.loops.forLoop;

import java.util.Scanner;

public class LargestOfNNumber {
    public static int findLargest(int num) {
        int largest = 0;
        int value;

        for(int i = 0; i < num; i++) {
            value = input.nextInt();
            if(largest < value) {
                largest = value;
            }
        }
        return largest;
    }
    static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = input.nextInt();
        System.out.print("Largest number is: "+findLargest(num));
        input.close();
    }
}
