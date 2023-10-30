package collections.stack;

import java.util.Arrays;
import java.util.Stack;

public class IsEmptyMethod {
    public static void main(String[] args) {
        Stack<Integer> hours = new Stack<>();

        Integer[] hour = new Integer[]{10, 5, 12};
        hours.addAll(Arrays.asList(hour));
        System.out.println(hours);

        hours.pop();    // 12
        hours.pop();    // 5
        hours.pop();    // 10

        System.out.println(hours.isEmpty());
        System.out.println(hours);
    }
}
