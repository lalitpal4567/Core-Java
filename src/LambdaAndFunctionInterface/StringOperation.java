package LambdaAndFunctionInterface;

import java.util.function.Predicate;

public class StringOperation {
    public boolean isInUpperCase(String word){
        Predicate<String> predicate = (text) -> Character.isUpperCase(text.charAt(0));
        return predicate.test(word);
    }
    public static void main(String[] args) {
        String str = "pineApple";
        StringOperation obj = new StringOperation();
        System.out.println(obj.isInUpperCase(str));
    }
}
