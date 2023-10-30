package javaBasics.array.oneD.stringArray;

public class InstanceStringArray {
    String[] array;
    String[] array2 = new String[2];

    public static void main(String[] args) {
        InstanceStringArray obj = new InstanceStringArray();
        System.out.println(obj.array);      // null
        System.out.println(obj.array2);     // [Ljava.lang.String;@4dd8dc3
    }
}
