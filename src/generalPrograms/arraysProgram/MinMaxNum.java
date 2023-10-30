package generalPrograms.arraysProgram;

import java.util.Scanner;

// Java Program to find the max and min number

public class MinMaxNum {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }

    public static int[] findMinMax(int[] arr, int size) {
        int min = arr[0];
        int max = arr[1];
        int[] maxMinEle = new int[2];

        for(int index = 0; index < size; index++) {
            if(arr[index] < min) {
                min = arr[index];
            }
            if(arr[index] > max) {
                max = arr[index];
            }
        }

        maxMinEle[0] = min;
        maxMinEle[1] = max;
        return maxMinEle;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        int[] minMaxArray = findMinMax(arr, size);
        System.out.println("Minimum element is: " + minMaxArray[0]);
        System.out.println("Maximum element is: " + minMaxArray[1]);
    }
}

