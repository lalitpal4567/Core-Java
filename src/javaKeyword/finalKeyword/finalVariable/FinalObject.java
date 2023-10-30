package javaKeyword.finalKeyword.finalVariable;

import java.util.Arrays;

public class FinalObject {
    static final int[] array = new int[]{5, 4, 3, 2};

    public static void main(String[] args) {
        int[] newArray = new int[]{2, 3, 4, 5};
//        array = newArray;   // compilation error

        array[0] = 10;
        array[3] = 20;
        System.out.println(Arrays.toString(array));
    }
}
