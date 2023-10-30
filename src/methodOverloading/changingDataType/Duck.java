package methodOverloading.changingDataType;

public class Duck {
    public static void glide(int i, int j){
        System.out.println("int, int");
    }
    public static void glide(long i, long j){
        System.out.println("long, long");
    }
    public static void glide(Integer i, Integer j){
        System.out.println("Integer, Integer");
    }
    public static void glide(int... nums){
        System.out.println("int... nums");
    }

    public static void main(String[] args) {
        glide(1, 2);
    }
}
