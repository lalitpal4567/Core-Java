package exceptionHandling.throwNewKeyword;

public class ThrowDemo2 {
    public static void passWord(String s) {
        String s1 = "1234@Abc";

        if(s1 == s) {
            System.out.println("Password is correct.");
        } else {
//             throw new Exception(); // error
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        String s = "1234@abc";

         try{
            passWord(s);  // this method should handle the exception
         }
         catch(ArithmeticException e) {
            System.out.println("inside main method.");
         }
    }
}
