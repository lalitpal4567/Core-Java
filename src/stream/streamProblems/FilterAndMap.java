package stream.streamProblems;

import java.util.Arrays;
import java.util.stream.IntStream;

// Given a list of integers, filter out the even numbers and then square the remaining numbers.
public class FilterAndMap {
    public static void main(String[] args) {
        int[] seatNo = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        Stream<IntStream> stream = Arrays.stream(seatNo); // compilation error

        IntStream stream = Arrays.stream(seatNo);
        stream.filter(num -> num % 2 == 0)
                .map(value -> (int)Math.pow(value, 2))
                .forEach(element -> System.out.println(element));
    }
}
