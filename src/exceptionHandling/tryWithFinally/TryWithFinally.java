package exceptionHandling.tryWithFinally;

public class TryWithFinally {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally block");
        }
        System.out.println("statement after finally");
    }
}
