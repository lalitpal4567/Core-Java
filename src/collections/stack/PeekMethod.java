package collections.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// peek() method returns the top of the stack without removing it.

public class PeekMethod {
    public static void main(String[] args) {
        Stack<Integer> token = new Stack<>();

        List<Integer> num = Arrays.asList(100, 200, 300);
        token.addAll(num);
        System.out.println(token);

        System.out.println(token.peek());   // 300

        System.out.println(token);  // [100, 200, 300]
    }
}
