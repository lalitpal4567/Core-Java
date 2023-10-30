package javaKeyword.finalKeyword.finalClass;

class Lizard{
    void showCase(){
        System.out.println("household lizard");
    }
}
final class Chameleon extends Lizard{
    @Override
    void showCase(){
        System.out.println("household chameleons");
    }
}

//class Crocodile extends Chameleon{
//    @Override
//    void showCase(){
//        System.out.println("household crocodile");
//    }
//}

public class Chipkali {
    public static void main(String[] args) {
//        Crocodile obj = new Crocodile();
//        obj.showCase();
    }
}
