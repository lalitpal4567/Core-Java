package exceptionHandling.tryCatchWithReturn;

public class TryCatchWithReturn3 {
    public static int printReturnValue() {
        try{
            int result = 2/0;
            System.out.println("In try block");
//             return 5;
        } catch(Exception e) {
            System.out.println("in catch block");
            return 10;
        } finally{
            System.out.println("In finally block");
            // return 15;
        }
        System.out.println("statements after finally block"); // this statement will not run till if either return is in both try and finally block or any one of these has return
        return 20;
    }

    public static void main(String[] args) {
        System.out.println(printReturnValue());
    }
}

