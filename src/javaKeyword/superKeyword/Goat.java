package javaKeyword.superKeyword;

class PetAnimal{
    PetAnimal(){
        System.out.println("pet animal");
    }
}
public class Goat extends PetAnimal {
    Goat(){
//        super();    // optional
        System.out.println("eating grass...");
    }

    public static void main(String[] args) {
        Goat obj = new Goat();
    }
}
