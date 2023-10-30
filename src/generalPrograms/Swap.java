package generalPrograms;

import java.util.Scanner;

// Swapping of two numbers using third variable
public class Swap {
    public static void swapNum(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping ");
        System.out.println("a: " + a + " b: " + b);
        swapNum(a, b);
    }
}
