package varargs;

public class VarargsDemo4 {
    public static void cleaningMemory(int size1, int... size2){
        System.out.println("cleaning " + size1 + " Kb memory");
        System.out.println("cleaning " + size2[0] + " Kb memory");
        System.out.println("cleaning " + size2[1] + " Kb memory");
    }

    public static void main(String[] args) {
        cleaningMemory(10, 50, 100);
    }
}

