package LambdaAndFunctionInterface;

import java.util.function.Predicate;

public class Exercise1 {
    int age;
    private static void check(Exercise1 exercise, Predicate<Exercise1> exer){
        String result = exer.test(exercise) ? "match" : "not match";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
        e1.age = 1;
        check(e1, e -> e.age < 5);
    }
}
