package exceptionHandling.tryWithCatch;

public class NestedCatch {
    public static void main(String[] args) {
        try{
            int a = 5 / 0;
        }catch(Exception e){
//            catch(ArithmeticException a){     // compilation error
//                System.out.println("arithmetic exception");
//            }
        }
        System.out.println("hello world");
    }
}
