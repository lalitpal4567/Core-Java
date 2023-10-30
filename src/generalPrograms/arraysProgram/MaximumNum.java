package generalPrograms.arraysProgram;

import java.util.Scanner;

// max element in the array
public class MaximumNum {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }

    public static int maxEle(int[] arr, int size) {
//		int max = Integer.MIN_VALUE;
        int max = arr[0];

        for(int index = 0; index < size; index++) {
            if(arr[index] > max) {
                max = arr[index];
            }
        }
        return max;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        System.out.println("Maximum element is: " + maxEle(arr, size));
    }
}

