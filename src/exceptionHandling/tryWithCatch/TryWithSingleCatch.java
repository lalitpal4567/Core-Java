package exceptionHandling.tryWithCatch;

public class TryWithSingleCatch {
    public static void fun(String str){
        try{
            char ch = str.charAt(5);    // throws exception
            System.out.println("inside try block");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);  // java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }
    }
    public static void main(String[] args) {
        String str = "Hello";
        fun(str);
    }
}
