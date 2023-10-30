package javaBasics.operators.unaryOperator;

public class OperatorTest3 {
    public static void main(String[] args) {
        int a = 5;
        boolean result = a++ > 5;
        boolean result2 = ++a > 5;
        System.out.println(result);     // false
        System.out.println(result2);    // true

    }
}
