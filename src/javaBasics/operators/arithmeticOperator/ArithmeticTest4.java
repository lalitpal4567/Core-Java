package javaBasics.operators.arithmeticOperator;

public class ArithmeticTest4 {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 50.5f;
        double f = 50;

        // byte + byte -> int
//        byte sum1 = a + a;  // compilation error  (returns integer)


        // short + short -> int
//        short sum2 = b + b; // compilation error  (returns integer)


        // byte + short -> int
        int sum3 = a + b;   // 30   (returns integer)

        // int + short -> int
        int sum4 = b + c;   // 50 (returns integer)


        // int + long -> long
//        int sum5 = c + d;   // compilation error (returns long)


        // long + float -> float
//        int sum6 = d + e;  // compilation error (returns float)


        // long + double -> double
//        int sum7 = d + f;   // compilation error (returns double)


        // float + double -> double
//        int sum8 = e + f;   // compilation error  (returns double)
    }
}
