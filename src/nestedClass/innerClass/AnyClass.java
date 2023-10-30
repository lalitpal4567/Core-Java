package nestedClass.innerClass;

//
public class AnyClass {
    int a = 1;
    static int b = 2;
    private int c = 3;
    protected int d = 4;
    public int e = 5;

    class AnyInnerClass {
        int x = 50;
        void show() {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
            System.out.println("d: " + d);
            System.out.println("e: " + e);
            System.out.println("x: " + x);
        }
    }

    public static void main(String[] args) {
        AnyClass obj = new AnyClass();
        AnyClass.AnyInnerClass inner = obj.new AnyInnerClass();
        inner.show();
        System.out.println(inner.x);
        System.out.println(obj.a);
    }
}
