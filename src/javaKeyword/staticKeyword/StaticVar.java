package javaKeyword.staticKeyword;

public class StaticVar {
    static int id = 5;
    String gender = "male";

    public void test() {
        // static String  name;		// compilation error
    }

    public static void show() {
        System.out.println("This is static method");
    }

    public static void main(String[] args) {
        System.out.println(id);
//		System.out.println(gender);  // access only by object reference
//		test();  // access only by object reference

        show();
        StaticVar.show();
        StaticVar obj = new StaticVar();
        obj.show();  // should be accessed in static way
    }
}

