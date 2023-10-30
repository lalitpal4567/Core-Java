package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// remove() method removes and returns the first element of the list
// remove() method is equivalent to pop() and removeFirst().
// (1) public T remove()    // removes and returns the first element of the list
// (2) public T remove(int index) // removes and returns element at specified index.
// (3) public boolean remove(Object o)  // removes and returns boolean value

public class RemoveMethod1 {
    public static void main(String[] args) {
        Integer[] position = {4, 10, 2, 22, 27};
        LinkedList<Integer> rank = new LinkedList<>(Arrays.asList(position));
        System.out.println(rank);

        // (1) public T remove()
        System.out.println(rank.remove());  // 4
        System.out.println(rank.remove());  // 10
        rank.remove();
        System.out.println(rank);

        rank.remove();
        rank.remove();
//        System.out.println(rank.remove());  // NoSuchElementException
        System.out.println(rank);

        System.out.println("Is list empty? " + (rank.isEmpty() ? "Yes" : "No"));
    }
}
