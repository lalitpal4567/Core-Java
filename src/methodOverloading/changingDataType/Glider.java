package methodOverloading.changingDataType;

public class Glider {
    public static void glide(String s){
        System.out.println("String");
    }
    public static void glide(String... s){
        System.out.println("String...");
    }
    public static void glide(Object o){
        System.out.println("Object");
    }
    public static void glide(String s, String t){
        System.out.println("String, String");
    }

    public static void main(String[] args) {
        glide("a");
        glide("a", "b");
        glide("a", "b", "c");
    }
}
