package varargs;

public class VarargsDemo3 {
    public static void cleaningMemory(int size1, int... size2){
        System.out.println("cleaning " + size1 + " Kb memory");
        System.out.println("cleaning " + size2[0] + " Kb memory");  // 50
    }

    public static void main(String[] args) {
//        cleaningMemory(10);
        cleaningMemory(10, 50);
    }
}
