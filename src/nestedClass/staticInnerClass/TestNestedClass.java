package nestedClass.staticInnerClass;

class Outer {
    int a = 5;
    public int b = 6;
    protected int c = 7;
    private int  d = 8;
    static int e = 9;

    static class Inner {
        void display() {
//             System.out.println("a: " + a); // compilation error
//             System.out.println("b: " + b); // compilation error
//             System.out.println("c: " + c); // compilation error
//             System.out.println("d: " + d); // compilation error
            System.out.println("e: " + e);
        }
    }
}
public class TestNestedClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
//         Outer.Inner.display(); // compilation error
    }
}
