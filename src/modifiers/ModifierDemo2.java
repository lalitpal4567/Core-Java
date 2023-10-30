package modifiers;

public class ModifierDemo2 {
    public void fun() throws IllegalArgumentException{
        System.out.println("hi");
    }

//    public void fun2() throws new IllegalArgumentException{   // compilation error
//        System.out.println("hello");
//    }
    public void fun3() throws ArrayIndexOutOfBoundsException, NullPointerException{
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        ModifierDemo2 obj = new ModifierDemo2();
        obj.fun();
    }
}
