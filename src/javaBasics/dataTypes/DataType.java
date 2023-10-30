package javaBasics.dataTypes;

// print default values of instance variables
// Instance variables are those variables which are declared inside the class and outside the method
// Default values are those values assigned by compiler
// when the variables are not initialized
class Data {
    int a;
    float b;
    double c;
    long d;
    char e;
    boolean f;
    byte g;
    short h;
}

public class DataType {

    public static void main(String[] args) {
        int a;
        float b = 0;
        double c;
        long d;
        char e;
        boolean f;
        byte g;
        short h;

        // default values
		Data obj = new Data();
		System.out.println(obj.a);  // 0
		System.out.println(obj.b);  // 0.0
		System.out.println(obj.c);  // 0.0
		System.out.println(obj.d);  // 0
		System.out.println(obj.e);  // -
		System.out.println(obj.f);  // false
		System.out.println(obj.g);  // 0
		System.out.println(obj.h);  // 0

//        System.out.println(a);
        System.out.println(b);      // 0
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);
    }
}

