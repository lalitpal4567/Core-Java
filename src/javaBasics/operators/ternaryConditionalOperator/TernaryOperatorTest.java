package javaBasics.operators.ternaryConditionalOperator;

public class TernaryOperatorTest {
    public static void main(String[] args) {
        final int a = 10;
        final int b = 20;
        byte c = (true) ? 10 : 20;
        byte d = (false) ? 10 : 20;
        byte e = (a < b) ? 10 : 20;     // compilation error (must be final)
        byte f = (a > b) ? 10 : 20;     // compilation error

    }
}
