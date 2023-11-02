package nestedClass.innerClass;

class OuterStructure {
    int x = 1;
    void task() {
        System.out.println("do a task");
    }

    private class InnerStructure {  // helper method
        int y = 50;
        void method() {
            System.out.println("Private class can't be accessed");
        }
    }
}

public class TestStructure {
    public static void main(String[] args) {
        OuterStructure obj = new OuterStructure();
//        OuterStructure.InnerStructure inner = obj.new InnerStructure(); // compilation error (private class object can't be instantiated)
//        inner.show();   // compilation error
//        System.out.println(inner.x);    // compilation error
    }
}