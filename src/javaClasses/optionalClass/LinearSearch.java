package javaClasses.optionalClass;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class LinearSearch {
    public Optional<Integer> linear(int[] arr, int key){
        return IntStream.range(0, arr.length)
                .boxed()
                .filter(index -> arr[index] == key)
                .findFirst();

    }
    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        Optional<Integer> option = obj.linear(new int[]{1,7,5,3,2,7,9}, 5);
        option.ifPresent(result -> System.out.println(result));
    }
}
