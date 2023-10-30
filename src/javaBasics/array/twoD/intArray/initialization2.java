package javaBasics.array.twoD.intArray;

public class initialization2 {
    public static void main(String[] args) {
//        int[][] arr = new int[][]{10, 20, 30, 40, 50, 60};     // compilation error

        int[][] arr2 = new int[][]{{10, 20, 30}, {40, 50, 60}};         // 2 X 3
        int[][] arr3 = new int[][]{new int[]{10, 20, 30}};              // 1 X 3
        int[][] arr4 = new int[][]{new int[]{10, 20, 30},{40, 50, 60}}; // 2 X 3
        int[][] arr5 = new int[][]{new int[]{10, 20}, new int[]{30, 40}, new int[]{50, 60}};    // 3 X 2

        int[][] arr6 = new int[3][];
        arr6[0] = new int[]{20, 30, 40};
//        arr6[0] = {20, 30, 40};     // compilation error
        arr6[1] = new int[]{10,50};
        arr6[2] = new int[]{60, 70, 80, 90, 100};
    }
}
