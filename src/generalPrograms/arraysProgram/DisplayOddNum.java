package generalPrograms.arraysProgram;

import java.util.Scanner;

public class DisplayOddNum {
    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }

    public static void printOdd(int[] arr, int size) {
        System.out.println("\nDisplaying Even numbers");
        System.out.print("[");

        for(int index = 0; index < size; index++) {
            if(arr[index] % 2 != 0) {
                System.out.print(arr[index] + ", ");
            }
        }
        System.out.println("\b\b]");
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        printOdd(arr, size);
    }
}

