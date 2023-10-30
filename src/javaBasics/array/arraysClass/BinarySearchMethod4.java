package javaBasics.array.arraysClass;

import java.util.Arrays;

public class BinarySearchMethod4 {
    public static void binarySearch(Object[] date, Object key){
        System.out.println(Arrays.binarySearch(date, key));
    }
    public static void main(String[] args) {
        int[] birthDate = {2, 6, 10, 16, 24, 28, 30};
        Integer[] birthDate2 = {2, 6, 10, 16, 24, 28, 30};
        String[] birthDate3 = {"a", "b", "c", "dog"};
        Object[] birthDate4 = {"23", "24", "28", "29", "31"};
        Object[] birthDate5 = {10, '1', "15", "twenty"};

//        binarySearch(birthDate, 16);    // compilation error
        binarySearch(birthDate2, 16);       // 3
        binarySearch(birthDate3, "b");      // 1
        binarySearch(birthDate3, "doggy");  // -5
        binarySearch(birthDate4, "31");     // 4
        binarySearch(birthDate5, "15");
    }
}
