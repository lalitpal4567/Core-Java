package javaBasics.array.oneD.stringArray;

import java.util.Arrays;

public class EqualsMethod {
    public static void main(String[] args) {
        String[] bugs = {"Cricket", "beetle", "ladybug"};
        String[] insects = bugs;

        System.out.println(bugs.equals(insects));
        System.out.println(insects);    // [Ljava.lang.String;@4dd8dc3
        System.out.println(Arrays.toString(insects));
    }
}
