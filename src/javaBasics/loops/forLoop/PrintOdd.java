package javaBasics.loops.forLoop;

import java.util.Scanner;

public class PrintOdd {
    public static void oddNum(int range) {
        for(int i = 0; i <= range; i++) {
            if(i % 2 == 1) {
                System.out.print(i + "\t");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = input.nextInt();
        oddNum(range);
        input.close();
    }
}
