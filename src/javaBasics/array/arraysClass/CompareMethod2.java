package javaBasics.array.arraysClass;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * null is smaller than any other values.
 * For numbers, normal numeric order applies.
 * For strings, one is smaller if is a prefix of another.
 * For string/characters, numbers are smaller than letters.
 * For strings/characters, uppercase is smaller than lowercase
 */
public class CompareMethod2 {
    public static void main(String[] args) {
        String[] str = {"a"};
        String[] str2 = {"aa"};
        String[] str3 = {"A"};
        String[] str4 = {null};
        String[] str5 = {"3"};
        String[] str6 = {"boy"};
        String[] str7 = {"apple"};
        String[] str8 = {"art"};
        System.out.println(Arrays.compare(str, str2));  // -1   str < str2
        System.out.println(Arrays.compare(str, str3));  // 32   str > str3
        System.out.println(Arrays.compare(str2, str4)); // 1    str2 > str4
        System.out.println(Arrays.compare(str3, str5)); // 14   str3 > str5
        System.out.println(Arrays.compare(str6, str7)); // 1    str6 > str7
        System.out.println(Arrays.compare(str7, str8)); // -2   str7 < str8

        System.out.println(Arrays.compare(new String[]{"23Days"}, new String[]{"24Days"})); // -1


    }
}
