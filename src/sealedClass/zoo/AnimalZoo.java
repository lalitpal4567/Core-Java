package sealedClass.zoo;

sealed class Mammal permits Equine{
    Mammal(){
        System.out.println("mammal class");
    }
}
sealed class Equine extends Mammal permits Zebra{
    Equine(){
        System.out.println("equine class");
    }
}
final class Zebra extends Equine{
    Zebra(){
        System.out.println("zebra class");
    }
}
public class AnimalZoo {
    public static void main(String[] args) {
        Zebra obj = new Zebra();
    }
}
