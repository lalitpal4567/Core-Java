package LambdaAndFunctionInterface;

import java.util.List;
import java.util.function.Predicate;

public class Exercise4 {
    public void remove(List<Character> chars){
        char end = 'z';
        Predicate<Character> predicate = c -> {
            char start = 'a';
            return start <= c && c <= end;
        };
//        char c = 'x';   // no compilation error
    }
    public static void main(String[] args) {

    }
}
