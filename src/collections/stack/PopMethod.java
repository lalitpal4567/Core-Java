package collections.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PopMethod {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        ArrayList<String> friends = new ArrayList<>(Arrays.asList("Lalit", "Sachin", "Raj"));
//        names.push(friends);    // compilation error
        names.addAll(friends);
        System.out.println(names);

        names.pop();    // Raj
        System.out.println(names.pop());    // Sachin
        System.out.println(names);

        names.pop();    // Lalit
        System.out.println(names);
    }
}
