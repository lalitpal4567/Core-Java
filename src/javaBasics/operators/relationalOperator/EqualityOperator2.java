package javaBasics.operators.relationalOperator;

// Equality operators can be applied to all data types including boolean values
// It returns boolean value either true or false

public class EqualityOperator2 {
    public static void main(String[] args) {
        System.out.println(10 == 10);       // true
        System.out.println(97 == 'a');      // true
        System.out.println(10 == 10.5);     // false
        System.out.println(10 == 10.0);     // true
        System.out.println(10 == 10.5F);    // false
        System.out.println(true == false);  // false
//        System.out.println(10.5 == "10.5");     // compilation error
        System.out.println(10.5 == 'a');    // false
        System.out.println('b' == 'B');     // false
        System.out.println("hi" == "hi");   // true
    }
}
