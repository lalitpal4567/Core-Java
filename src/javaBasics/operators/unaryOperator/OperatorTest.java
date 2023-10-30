package javaBasics.operators.unaryOperator;

public class OperatorTest {
    public static void main(String[] args) {
        byte a = 10;
        a++;    // implicit typecasting
        System.out.println(a);  // 11

        short b = 20;
        b++;    // implicit typecasting
        System.out.println(b);  // 21

        int c = 5;
        c++;
        System.out.println(c);  // 6

        long d = 25;
        d++;
        System.out.println(d);  // 26

        float e = 30;
        e++;
        System.out.println(e);  // 31.0

        double f = 10.5;
        f++;
        System.out.println(f);      // 11.5

        char ch = 'a';
        ch++;
        System.out.println(ch);     // b
    }
}
