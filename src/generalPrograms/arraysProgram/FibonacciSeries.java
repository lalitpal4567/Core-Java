package generalPrograms.arraysProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void generateFib(int[] fib, int size) {
        for(int index = 2; index < size; index++) {
            fib[index] = fib[index - 2] + fib[index - 1];
        }
    }
    static Scanner input = new Scanner(System.in);

    public static void main(String[]args) {
        int[] fib = new int[50];
        System.out.print("enter the range:  ");
        int size = input.nextInt();

        fib[0] = 0;
        fib[1] = 1;

        generateFib(fib, size);

        System.out.println("\nDisplaying fibonacci series: " + size);
        System.out.print("[");
        for(int index = 0; index < size; index++) {
            System.out.print(fib[index] + ", ");
        }
        System.out.println("\b\b]");
    }
}