package javaBasics.operators.unaryOperator;

// Increment/Decrement operator can be applied on all data types except boolean type

public class OperatorTest2 {
    public static void main(String[] args) {
        byte a = 10;
        System.out.println(a++);  // 10

        short b = 20;
        System.out.println(b++);  // 20

        int c = 5;
        System.out.println(c++);  // 5

        long d = 25;
        System.out.println(d++);  // 25

        float e = 30;
        System.out.println(e++);  // 30.0

        double f = 10.5;
        System.out.println(f++);      // 10.5

        char ch = 'a';
        System.out.println(ch++);     // a

        boolean status = false;
//        status++;   // compilation error

    }
}
