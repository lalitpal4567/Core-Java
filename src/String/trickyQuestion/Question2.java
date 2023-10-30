package String.trickyQuestion;

public class Question2 {
    public static void main(String[] args) {
        var numbers = "012345678".indent(1);
        System.out.println(numbers.charAt(1));
        numbers = numbers.stripLeading();
        System.out.println(numbers.substring(1,3)); // 12
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7));   // 78

    }
}
