package classAndObject.classes;

final class A{
    private int a = 5;
    private void show(){
        System.out.println("a: " + a);
    }
}
public class FinalClass {
    public static void main(String[] args) {
        A obj = new A();
//        System.out.println(obj.a);  // compilation error
//        obj.show();     // compilation error
    }
}
