package exceptionHandling.tryWithFinally;

public class TryDemo {
    public static void main(String[] args) {
            String str = null;
        try{
            System.out.println("before exception in try block");
            System.out.println(str.length());
            System.out.println("after exception in try block");
        }
        finally{
            System.out.println("in the finally block");
        }
        System.out.println("Welcome!");
    }
}
