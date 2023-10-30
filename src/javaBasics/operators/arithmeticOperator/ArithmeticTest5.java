package javaBasics.operators.arithmeticOperator;

public class ArithmeticTest5 {
    public static void main(String[] args) {
        byte a = 1;
        char ch = 'a';
        char ch2 = 'a';

//        byte sum1 = a + ch;     // compilation error (returns integer)
//        char sum2 = a + ch;     // compilation error (returns integer)

//        char sum3 = ch + ch2;   // compilation error (returns integer)
        char sum4 = (char)(ch + ch2);   //
        System.out.println(sum4);   // Â (special character)
    }
}
