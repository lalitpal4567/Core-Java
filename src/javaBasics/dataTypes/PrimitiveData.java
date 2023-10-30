package javaBasics.dataTypes;

// There are 8 primitive data types in java.
public class PrimitiveData {
    int a = 1;
    short b = 2;
    long c = 3L;  // by default it is int
    float d = 4.4f;  // by default it is double
    double e = 5.5;
    byte f = 6;
    char g = 'A' ;
    boolean h = true;

    public static void main(String[] args) {
        PrimitiveData obj = new PrimitiveData();
        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
        System.out.println("c: " + obj.c);
        System.out.println("d: " + obj.d);
        System.out.println("e: " + obj.e);
        System.out.println("f: " + obj.f);
        System.out.println("g: " + obj.g);
        System.out.println("h: " + obj.h);
    }
}
