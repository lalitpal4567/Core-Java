package javaKeyword.finalKeyword.finalMethod;

class Parent{
    public final void lunch(){
        System.out.println("having lunch at home");
    }
}

public class ChildDefinition extends Parent{
//    @Override
//    public void lunch(){    // compilation error
//        System.out.println("having lunch in restaurant");
//    }

    public static void main(String[] args) {}
}
