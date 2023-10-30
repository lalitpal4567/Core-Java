package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// removeLast() method removes and returns the last element from this list.
// NoSuchElementException - if this list is empty
// (1) public E removeLast()

public class RemoveLastMethod {
    public static void main(String[] args) {
        String[] arr = {"Father", "Mother", "Daughter", "Son", "Uncle", "Nephew", "Grandfather", "Granny"};
        LinkedList<String> relatives = new LinkedList<>(Arrays.asList(arr));

        System.out.println(relatives);

        System.out.println(relatives.removeLast()); // Granny
        System.out.println(relatives.removeLast()); // Grandfather

        if (relatives.removeLast() == "Nephew") {
            relatives.addLast("Nephew");
        }

        System.out.println(relatives);
    }
}
