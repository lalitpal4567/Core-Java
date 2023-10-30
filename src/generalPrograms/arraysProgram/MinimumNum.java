package generalPrograms.arraysProgram;

import java.util.Scanner;

// min element in the array
public class MinimumNum {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    public static int minEle(int[] arr, int size) {
        int min = Integer.MAX_VALUE;

        for(int index = 0; index < size; index++) {
            if(arr[index] < min) {
                min = arr[index];
            }
        }
        return min;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        System.out.println("Minimum element is: " + minEle(arr, size));
    }
}

