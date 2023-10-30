package javaBasics.array.oneD.stringArray;

public class StringArrayTest {
    public static void main(String[] args) {
        String[] strings = {"stringValue"};
        Object[] objects = strings;     // Object is broader than string
        String[] againStrings = (String[])objects;
//        againStrings[0] = new StringBuilder();  // compilation error

        objects[0] = new StringBuilder();   // ArrayStoreException at runtime
    }
}
