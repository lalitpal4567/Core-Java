package javaBasics.operators.ternaryConditionalOperator;

public class TernaryNesting {
    public static void main(String[] args) {
        int x = (30 > 40) ? 10 : (100 > 200) ? 20 : 30;
        System.out.println(x);  // 30
    }
}
