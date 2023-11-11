package stream.streamProblems;

import java.util.Arrays;

// Given a list of integers, filter out the even numbers and calculate their sum.
public class FilterAndSum {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(num)
                .filter(value -> value % 2 == 0)
                .sum();

        System.out.println(sum);
    }
}
