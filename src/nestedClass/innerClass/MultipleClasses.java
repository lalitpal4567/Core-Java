package nestedClass.innerClass;

class A {
    void meth1() {
        System.out.println("A");
    }
    class B {
        void meth2() {
            System.out.println("B");
        }
    }
    public class C {
        void meth3() {
            System.out.println("C");
        }
    }
    private class D {
        void meth4() {
            System.out.println("D");
        }
    }
    protected class E {
        void meth5() {
            System.out.println("E");
        }
    }
    static class F {
        void meth6() {
            System.out.println("F");
        }
    }
}

public class MultipleClasses {
    public static void main(String[] args) {
        A a = new A();  // outer class
        A.B b = a.new B();  // inner class B object
        A.C c = a.new C();
//         A.D d = a.new D();  // compilation error (private class)
        A.E e = a.new E();
        A.F f = new A.F();

        a.meth1();
        b.meth2();
        c.meth3();
        // d.meth4();   // compilation error (private class)
        e.meth5();
        f.meth6();
    }
}
