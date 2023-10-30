package generalPrograms;

import java.util.Scanner;

public class PrintReverseCounting {
    public static void displayCounting(int range) {
        for(int i = range; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = input.nextInt();
        displayCounting(range);
        input.close();
    }
}

