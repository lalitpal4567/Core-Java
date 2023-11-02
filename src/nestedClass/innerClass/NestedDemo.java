package nestedClass.innerClass;

class OuterClass1 {
    int x = 10;

    protected class InnerClass {
        int y = 20;
        void add() {
            System.out.println(y + x);
        }
    }
}

public class NestedDemo {
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        OuterClass1.InnerClass inner = outer.new InnerClass();
        inner.add();
    }
}
