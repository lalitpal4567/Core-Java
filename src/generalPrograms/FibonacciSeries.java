package generalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacci(int a, int b, int c, int range) {
        for(int i = 0; i < range; i++) {
            System.out.print(a + "  ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = input.nextInt();
        printFibonacci(a, b, c, range);
        input.close();
    }
}
