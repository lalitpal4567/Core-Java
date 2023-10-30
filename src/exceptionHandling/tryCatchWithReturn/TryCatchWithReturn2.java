package exceptionHandling.tryCatchWithReturn;

public class TryCatchWithReturn2 {
    public static int printReturnValue() {
        try{
            System.out.println("try block");
            return 5;
        }
        catch(Exception e) {
            System.out.println("catch block");
            return 10;
        }
        finally{
            System.out.println("finally block");
            return 15;
        }
//        System.out.println("after finally block");  // compilation error
    }

    public static void main(String[] args) {
        System.out.println(printReturnValue());     // 15
    }
}

