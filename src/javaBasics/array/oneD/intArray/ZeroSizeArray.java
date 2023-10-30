package javaBasics.array.oneD.intArray;

public class ZeroSizeArray {
    public static void main(String[] args) {
        int[] arr = new int[0];
        arr[0] = 10;
        System.out.println(arr[0]);     // ArrayIndexOutOfBoundException
    }
}
