package javaKeyword.staticKeyword;

// count number of objects

public class CountObjects {
    static int count;
    CountObjects(){
        count++;
    }

    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();

        System.out.println("number of objects: " + count);
        System.out.println("number of objects: " + CountObjects.count);
    }
}
