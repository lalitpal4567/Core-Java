package javaKeyword.finalKeyword.finalClass;

// Object of final class can be created
final class Panda{
    public void activity(){
        System.out.println("eating...");
    }
}

public class FinalDecision {
    public static void main(String[] args){
        Panda obj = new Panda();
        obj.activity();
    }
}
