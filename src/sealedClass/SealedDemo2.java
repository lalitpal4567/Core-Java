package sealedClass;

sealed class Animal permits Dog, Cat{
    public void eat(){
        System.out.println("eating pedigree");
    }
}
final class Dog extends Animal{
    public void woof(){
        System.out.println("woof woof");
    }
}
final class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("eating rats");
    }
    public void meow(){
        System.out.println("meow");
    }
}
public class SealedDemo2 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        Cat obj2 = new Cat();

        obj.woof();    // woof woof
        obj.eat();      // eating pedigree

        obj2.eat();     // eating rats
        obj2.meow();    // meow
    }
}
