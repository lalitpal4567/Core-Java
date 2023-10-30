package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// element() method returns the first element of the list but does not remove.
// It's equivalent method is peek(), peekFirst() and getFirst().
// (1) public T element()

public class ElementMethod {
    public static void main(String[] args) {
        LinkedList<Integer> followers = new LinkedList<>();
        followers.add(10);
        followers.add(150);
        followers.add(500);
        followers.add(400);
        followers.add(700);
        System.out.println(followers);

        System.out.println(followers.element()); // 10
        System.out.println(followers.element()); // 10
        System.out.println(followers);
    }
}
