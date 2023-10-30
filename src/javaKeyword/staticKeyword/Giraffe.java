package javaKeyword.staticKeyword;

public class Giraffe {
    public void eat(Giraffe g){
        drink();
        allGiraffeGoHome(g);
        allGiraffeComeOut();
    }
    public void drink(){
//        eat();  // compilation error
//        allGiraffeGoHome();     // compilation error
        allGiraffeComeOut();
    }
    public static void allGiraffeGoHome(Giraffe g){
        g.eat(g);
        allGiraffeComeOut();
//        drink();    // compilation error
    }
    public static void allGiraffeComeOut(){
//        allGiraffeGoHome();     // compilation error
//        eat();      // compilation error
//        drink();    // compilation error
    }


}
