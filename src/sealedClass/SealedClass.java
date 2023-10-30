package sealedClass;

sealed class Parent permits Child, Grandfather{
    public void methodOne(){
        System.out.println("parent class");
    }
}
sealed class Child extends Parent permits Unknown{
    public void methodTwo(){
        System.out.println("child class");
    }
}
non-sealed class Grandfather extends Parent{
    public void methodThree(){
        System.out.println("grandfather class");
    }
}
final class Unknown extends Child{

}
public class SealedClass extends Grandfather{
    public static void main(String[] args) {
        Child obj = new Child();
        Grandfather obj2 = new Grandfather();

        obj.methodOne();
        obj.methodTwo();

        obj2.methodOne();
        obj2.methodThree();
    }
}
