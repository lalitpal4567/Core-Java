package javaKeyword.superKeyword;

class WildAnimal{
    public void eat(){
        System.out.println("eating...");
    }
}
public class Fox extends WildAnimal {
    public void eat(){
        System.out.println("eating bones...");
        super.eat();
    }

    public static void main(String[] args) {
        Fox obj = new Fox();
        obj.eat();
//        super.eat();    // compilation error
    }
}
