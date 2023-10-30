package javaBasics.operators.assignmentOperator;

public class AssignTest2 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = b = c = d = 20;
        a += b -= c *= d /= 20;     // from right to left
        System.out.println(a);      // 20
    }
}
