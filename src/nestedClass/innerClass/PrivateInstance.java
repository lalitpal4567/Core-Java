package nestedClass.innerClass;

class OutClass {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }
}

public class PrivateInstance {
    public static void main(String[] args) {
        OutClass myOuter = new OutClass();
//        InnerClass myInner = myOuter.new InnerClass(); // compilation error (private class)
//        System.out.println(myInner.y + myOuter.x);
    }
}
