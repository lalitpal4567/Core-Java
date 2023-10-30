package generalPrograms.arraysProgram;

import java.util.Scanner;

// Java program to display elements of the array in reverse order

public class DisplayReverse {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr["+index+"] = ");
            arr[index] = input.nextInt();
        }
    }
    public static void printReverse(int[] arr, int size) {
        System.out.println("\nDisplaying reverse array");

        for(int index = size - 1; index >= 0; index--) {
            System.out.println(arr[index]);
        }
    }
    static Scanner input = new  Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        printReverse(arr, size);
    }
}

