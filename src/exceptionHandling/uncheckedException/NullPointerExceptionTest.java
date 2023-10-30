package exceptionHandling.uncheckedException;

public class NullPointerExceptionTest {
    public static void main(String[] args) {
        String str1 = null;
        try {
            System.out.println(str1.length());
        }
//        catch(Exception e) {      // compilation error
//            System.out.println("This is null string.");
//        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
        catch(Exception e) {
            System.out.println("This is null string.");
        }
    }
}
