package LambdaAndFunctionInterface;

interface TextValidation<T>{
    boolean check(T str);
}
public class TextChecker {
    public static <T> boolean validate(T str, TextValidation<T> validate){
        if(validate.check(str))
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "youtube".toUpperCase();
        boolean result = validate(str, (String text) -> text.equals(text.toUpperCase()));
        System.out.println(result);
    }
}
