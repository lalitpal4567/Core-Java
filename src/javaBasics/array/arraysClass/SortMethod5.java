package javaBasics.array.arraysClass;

import java.util.Arrays;

//(15) public static void sort(Object[] a)

public class
SortMethod5 {
    public static void main(String[] args) {
        String[] string = {"10", "2", "100"};
        String[] string2 = {"2", "two", "Two", "1", "@"};
        String[] string3 = {"#", "4A", "c", null};

        System.out.println("before sorting");
        System.out.println(Arrays.toString(string));
        System.out.println(Arrays.toString(string2));
        System.out.println(Arrays.toString(string3));

        System.out.println("after sorting");
        Arrays.sort(string);
        Arrays.sort(string2);
//        Arrays.sort(string3);       // NullPointerException
        System.out.println(Arrays.toString(string));    // [10, 100, 2]
        System.out.println(Arrays.toString(string2));   // [1, 2, @, Two, two]
        System.out.println(Arrays.toString(string3));
    }
}
