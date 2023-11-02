package nestedClass.innerClass;

public class NestedMethod {
    void className() {
        System.out.println("OuterClassShow");
    }
    public void classVisibility() {
        System.out.println("public");
    }
    protected void classType() {
        System.out.println("Userdefined");
    }
    private void methodsType() {
        System.out.println("concrete methods");
    }
    static void title() {
        System.out.println("Java inner class");
    }

    public class InnerClass {
        void methodCalling() {
            className();
            classVisibility();
            classType();
            methodsType();
            title();
        }
    }

    public static void main(String[] args) {
        NestedMethod outer = new NestedMethod();
        InnerClass inner = outer.new InnerClass();
        inner.methodCalling();
    }
}
