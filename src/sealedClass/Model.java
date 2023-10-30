package sealedClass;

sealed class XPosition{     // Sealed class must have subclasses
    XPosition(){
        System.out.println("x dimension");
    }
}
final class TwoDModel extends XPosition{      // sealed, non-sealed or final modifiers expected
    TwoDModel(){
        System.out.println("two D model");
    }
}
public class Model {
    public static void main(String[] args) {
        TwoDModel obj = new TwoDModel();
    }
}
