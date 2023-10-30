package generalPrograms.arraysProgram;

import java.util.Scanner;

// count the occurrence of key in an array
public class CountKeyFrequency {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    public static int countKey(int[] arr, int size, int key) {
        int count = 0;
        for(int index = 0; index < size; index++) {
            if(arr[index] == key) {
                count++;
            }
        }
        return count;
    }

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        System.out.print("\nEnter the key: ");
        int key = input.nextInt();
        System.out.println("Frequency of "+ key + " is: " + countKey(arr, size, key));
    }
}

