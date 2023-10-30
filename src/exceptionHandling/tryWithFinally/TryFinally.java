package exceptionHandling.tryWithFinally;

public class TryFinally {
    public static int method() {
        try {
            System.out.println("Try Block with return type");
            return 10;
        } finally {
            System.out.println("Finally Block always execute");
        }
        // System.out.println("rest codes.");       // compilation error
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
