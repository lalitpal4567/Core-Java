package LambdaAndFunctionInterface;

@FunctionalInterface
interface CapitalLetterPresence<T>{
    boolean test(T element);
}
public class ComplexFunctionalInterface2 {
    public static <T> boolean checkLetter(T str, CapitalLetterPresence<T> o){
        return o.test(str);
    }
    public static void main(String[] args) {
        CapitalLetterPresence<String> condition = (str) -> {
            for(char ch : str.toCharArray()){
                if(Character.isUpperCase(ch))
                    return true;
            }
            return false;
        };

        CapitalLetterPresence<Integer> condition2 = (num)-> num % 2 != 0;

        System.out.println(checkLetter("hell", condition));
        System.out.println(checkLetter(23, condition2));
    }
}
