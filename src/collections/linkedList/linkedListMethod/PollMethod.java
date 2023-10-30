package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// poll() method returns and removes the first element of the list.
// It removes the first element.
// (1) public T poll()

public class PollMethod {
    public static void main(String[] args) {
        LinkedList<Character> password = new LinkedList<Character>();
        password.add('a');
        password.add('b');
        password.add('c');
        password.add('@');
        password.add('1');
        password.add('2');
        password.add('3');
        System.out.println(password);

        System.out.println(password.poll());  // a
        System.out.println(password.poll());  // b

        System.out.println(password);
    }
}
