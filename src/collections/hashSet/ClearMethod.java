package collections.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ClearMethod {
    public static void main(String[] args) {
        HashSet<Integer> bonus = new HashSet<>();
        Integer[] arr = new Integer[]{100, 400, 300, 200, 400, 700};
        bonus.addAll(Arrays.asList(arr));

//        bonus.forEach((value) -> System.out.println(value));    // lambda expression
        bonus.forEach(System.out::println);
    }
}
