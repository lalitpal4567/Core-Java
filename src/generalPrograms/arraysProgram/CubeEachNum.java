package generalPrograms.arraysProgram;

import java.util.Scanner;

// Write a program which takes in 10 values and creates another array which has cubes of the values (or factorial) and prints it.

public class CubeEachNum {

    public static void inputArr(int[] arr) {
        System.out.println("Enter the elements");

        for(int index = 0; index < arr.length; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    public static void cubeEle(int[] arr, int[] cube) {
        int index = 0;
        for(int value : arr) {
            cube[index++] = value * value * value;
        }
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] cube = new int[10];

        inputArr(arr);
        cubeEle(arr, cube);

        System.out.println("\nPrinting the cube");
        System.out.print("[");

        for (int i : cube) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }
}

