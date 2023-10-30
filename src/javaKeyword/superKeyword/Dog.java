package javaKeyword.superKeyword;

class Animal{
    String color = "white";
}
public class Dog extends Animal {
    String color = "black";
    public void displayColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    public static void main(String[] args) {
        Dog pug = new Dog();
        pug.displayColor();
    }
}
