package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OddEvenTest {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Even();

    }
}
class Even implements Predicate<Integer>{
    @Override
    public boolean test(Integer num){
        return num % 2 == 0;
    }
}
class Odd implements Predicate<Integer> {
    @Override
    public boolean test(Integer num) {
        return num % 2 != 0;
    }
}