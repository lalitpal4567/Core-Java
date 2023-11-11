package stream.streamProblems;

import java.util.Arrays;

// Given a list of integers, filter out the even numbers,
// square the remaining odd numbers, and then calculate their sum.
public class FilterAndMapWithInteger {
    public static void main(String[] args) {
        int[] routeNo = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = Arrays.stream(routeNo)
                .filter(num -> num % 2 != 0)
                .map(value -> value * value)
                .sum();

        System.out.println(sum);

    }
}
