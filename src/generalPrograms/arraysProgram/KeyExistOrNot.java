package generalPrograms.arraysProgram;

import java.util.Scanner;

// Java program to check whether a key exist or not

public class KeyExistOrNot {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    public static boolean doesKeyExist(int[] arr, int key, int size) {
        for(int index = 0; index < size; index++) {
            if(arr[index] == key) {
                return true;
            }
        }
        return false;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        System.out.print("Enter the key to be searched: ");
        int key = input.nextInt();

        if(doesKeyExist(arr, key, size)) {
            System.out.println("\nKey exist");
        } else {
            System.out.println("Key does not exist.");
        }
    }
}

