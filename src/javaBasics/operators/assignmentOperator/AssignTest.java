package javaBasics.operators.assignmentOperator;

public class AssignTest {
    public static void main(String[] args) {
//        int a = b = c = 5;  // compilation error
        int a, b, c;
        a = b = c = 10;
        System.out.println(a + " " + b + " " + c);

    }
}
