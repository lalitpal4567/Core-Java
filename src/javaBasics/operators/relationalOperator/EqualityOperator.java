package javaBasics.operators.relationalOperator;

// To compare with objects either they should be of same type or have parent-child relationship.
public class EqualityOperator {
    public static void main(String[] args) {
        System.out.println((10 < 30) == (30 < 50));  // true

        String str1 = new String("hello");
        StringBuilder message = new StringBuilder("hello");
        StringBuffer str2 = new StringBuffer("hello");
//        System.out.println(str1 == str2);   // compilation error  (parent child relationship must exist)
//        System.out.println(str1 == message);    // compilation error (parent child relationship must


        // Parent class
        Object str3 = new Object();
        System.out.println(str3 == str1);   // false

        Object str4 = new String("hello");
        System.out.println(str4 == str3);   // false
    }
}
