package mainMethod;

// Varargs is just like normal array than can take variable arguments

public class MainWithVarargs {
    public static void main(String... args) {       // exactly 3 dots
        System.out.println(args[0]);
        System.out.println(args[1]);
    }

//    public static void main(String ...args) {       // no compilation error
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//    }

//    public static void main(String...args) {       // no compilation error
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//    }

//    public static void main(String[] args){       // no compilation error
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//    }
}
