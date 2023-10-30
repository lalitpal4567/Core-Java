package exceptionHandling.tryWithCatch;

public class TryCatchObjectTest {
    public static void main(String[] args) {
        try{
            int a = 5, b = 5;
            int result = a / b;
            System.out.println("Result: " + result);
        }
//        System.out.println("between try and catch");   // compilation error
        catch(ArithmeticException e) {
            System.out.println("Can't divide by 0.");
        }
        // System.out.println(a); // Variables or objects created inside the try block can't be used outside the try block
    }
}
