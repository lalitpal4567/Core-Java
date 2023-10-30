package javaKeyword.finalKeyword.finalVariable;

public class ReadOnly {
    final float PI = 3.14F;
    final int var;      // blank final, must be initialized

    ReadOnly(){
        var = 10;
    }
    void change(){
//        PI = 3.147F;    // compilation error
//        var = 50;       // compilation error

        System.out.println("PI: " + PI);
        System.out.println("var: " + var);
    }

    public static void main(String[] args) {
        ReadOnly obj = new ReadOnly();
        obj.change();
    }
}
