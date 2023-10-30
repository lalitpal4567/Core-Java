package varargs;

public class VarargsDemo2 {
    public static void cleaningMemory(int size1, int... size2){
        System.out.println("cleaning " + size1 + " Kb memory");
        System.out.println("cleaning " + size2 + " Kb memory"); // cleaning [I@6acbcfc0 Kb memory
//        System.out.println("cleaning " + size2[0] + " Kb memory");  // ArrayIndexOutOfBoundException
    }

    public static void main(String[] args) {
//        cleaningMemory();     // compilation error
        cleaningMemory(10);
    }
}
