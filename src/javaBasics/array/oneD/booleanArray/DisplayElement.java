package javaBasics.array.oneD.booleanArray;

import java.util.Scanner;

public class DisplayElement {
    public static void printArr(boolean[] boolArr) {
        System.out.println("Displaying the array elements");
        for(int index = 0; index < boolArr.length; index++) {
            System.out.println("arr[" + index + "] = " + boolArr[index]);
        }
    }

    public static void main(String[] args) {
        boolean[] boolArr = new boolean[]{true, false, false, false, true};
        printArr(boolArr);
    }
}
