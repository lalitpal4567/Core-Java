package javaKeyword.staticKeyword;

public class Profile {
    String name = "Raj";

    public static void first(){}
    public static void second(){}

//    public void third(){
//        System.out.println("name: " + name);
//    }

//    public static void third(){
//        System.out.println("name: " + name);    // compilation error
//    }

    public static void main(String[] args) {
        first();
        second();
//        third();    // compilation error
    }
}
