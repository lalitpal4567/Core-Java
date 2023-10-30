package javaKeyword.staticKeyword;

public class Gorilla {
    public static int count;
    public static void addGorilla(){
        count++;
    }
    public void babyGorilla(){
        count++;
    }
    public void announceBabies(){
        addGorilla();
        babyGorilla();
    }
    public static void announceBabiesToEveryone(){
        addGorilla();
//        babyGorilla();  // compilation error
//        announceBabies();   // compilation error
    }

    public static void main(String[] args) {
        addGorilla();
        announceBabiesToEveryone();

        Gorilla obj = new Gorilla();
        obj.babyGorilla();
        obj.announceBabies();
    }
}
