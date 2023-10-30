package generalPrograms.arraysProgram;

import java.util.Scanner;

// Java program to print all index of the specified key

public class KeyAllIndex {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }

    public static void printIndex(int[] arr, int key, int size) {
        System.out.print("[");
        for(int index = 0; index < size; index++) {
            if(arr[index] == key) {
                System.out.print(index + ", ");
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
        System.out.print("\nEnter the key: ");
        int key = input.nextInt();

        printIndex(arr,  key, size);
    }
}

