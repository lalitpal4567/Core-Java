package nestedClass.innerClass;

public class InnerClassDemo {
    int a = 1;
    static int b = 2;
    private int c = 3;
    protected int d = 4;
    public int e = 5;

    class Derived {
        public void show() {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
            System.out.println("d: " + d);
            System.out.println("e: " + e);
        }
    }

    public static void main(String[] args) {
        InnerClassDemo inner = new InnerClassDemo();
//        InnerClassDemo.Derived derived = inner.new Derived();  // valid
        Derived derived2 = inner.new Derived();
//        derived2.show();


        new InnerClassDemo().new Derived().show();  // valid
    }
}
