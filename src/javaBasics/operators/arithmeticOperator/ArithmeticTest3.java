package javaBasics.operators.arithmeticOperator;

public class ArithmeticTest3 {
    public static void main(String[] args) {
        // byte
        byte a1 = 100;
        byte b1 = 28;

        byte sum1 = (byte)(a1 + b1);
        System.out.println(sum1);   // -128

//        ------------------------------------------------------

        // short
        short a2 = 1;
        short b2 = 32766;

        byte sum2 = (byte)(a2 + b2);
        short sum3 = (short)(a2 + b2);
        System.out.println(sum2);   // -1
        System.out.println(sum3);   // 32767

    }
}
