package javaKeyword.superKeyword;

class A{
    int a;
}
class B extends A{
    int a;
    B(int a, int b){
        super.a = b;
//        a = b;    // or
        this.a = a;
    }
    public void showInfo(){
        System.out.println("a in class A: " + super.a); // 20
        System.out.println("a in class B: " + a);   // 10
    }
}
public class VariableTest {
    public static void main(String[] args) {
        B obj = new B(10, 20);
        obj.showInfo();
    }
}
