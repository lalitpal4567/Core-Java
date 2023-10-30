package javaBasics.operators.arithmeticOperator;

public class ArithmeticTest {
    public static void main(String[] args) {
        // byte
        byte a = 20;
        byte b = 30;

//        byte sum = a + b;   // compilation error (returns integer)
//        short sum2 = a + b;     // compilation  error (returns integer)
        int sum3 = a + b;   // 50


//        --------------------------------------------------------------------

        // short
        short a2 = 40;
        short b2 = 60;

//        byte sum4 = a2 + b2;    // compilation error (returns integer)
//        short sum5 = a2 + b2;   // compilation error (returns integer)
        int sum6 = a2 +  b2;    // 100

//        --------------------------------------------------------------------

        // int
        int a3 = 10;
        int b3 = 20;

//        byte sum7 = a3 + b3;    // compilation error (returns integer)
//        short sum8 = a3 + b3;   // compilation error (returns integer)
        int sum9 = a3 + b3;     // compilation error (returns integer)
    }
}
