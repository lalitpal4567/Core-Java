package exceptionHandling.tryCatchWithReturn;

public class TryCatchWithReturnDemo {
    public static void exception1(){
        try{
            String str = null;
            System.out.println(str.length());
            System.out.println("In try block");
            return;
        }
        catch(Exception e) {
            System.out.println("String is null");
            return;
        }
        finally {
            System.out.println("In the finally block");
        }
//        System.out.println("Welcome!");   // compilation error
    }
    public static void exception2(){
        try{
            String str = null;
            System.out.println(str.length());
            System.out.println("In try block");
            return;
        }
        catch(Exception e) {
            System.out.println("String is null");
        }
        finally {
            System.out.println("In the finally block");
        }
        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        exception1();
        exception2();
    }
}
