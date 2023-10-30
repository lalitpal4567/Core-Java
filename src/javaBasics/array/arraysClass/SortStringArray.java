package javaBasics.array.arraysClass;

import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] data = {"2", "12", "two", "0zero", "twelve", "Twelve", "13thirteen"};

        System.out.println("before sorting");
        System.out.println(Arrays.toString(data));

        System.out.println("after sorting");
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
