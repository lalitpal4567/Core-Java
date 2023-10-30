package generalPrograms.arraysProgram;

import java.util.Scanner;

// Java program to print the index of the specified key

public class KeyIndex {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index+"] = ");
            arr[index] = input.nextInt();
        }
    }

    public static int searchIndex(int[] arr, int key, int size) {
        for(int index = 0; index < size; index++) {
            if(arr[index] == key) {
                return index;
            }
        }
        return -1;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        System.out.print("Enter the key: ");
        int key = input.nextInt();

        int indexValue = searchIndex(arr, key, size);
        if(indexValue > -1) {
            System.out.println(key + " found at index: " + indexValue);
        } else {
            System.out.println("key not found");
        }
    }
}

