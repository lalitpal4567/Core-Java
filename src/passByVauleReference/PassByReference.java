package passByVauleReference;

// The variable assignment is only to the method parameter and does not affect the caller.
/*
In Java, String objects are passed by reference, meaning that the reference to the memory
location of the object is passed. However, due to the immutability of Strings, any changes
made to the parameter within a method or function do not affect the original String object
outside the method or function. To modify the original String object, you can use mutable
classes like StringBuilder or StringBuffer.
 */

public class PassByReference {
    public static void render(String name){
        name = "labrador";
        System.out.println("inside render method: " + name);
    }

    public static void main(String[] args) {
        String dogName = "husky";
        System.out.println(dogName);

        System.out.println("after changing...");
        render(dogName);
        System.out.println(dogName);    // husky
    }
}
