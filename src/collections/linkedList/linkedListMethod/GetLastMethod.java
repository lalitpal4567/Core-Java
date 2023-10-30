package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// getLast() method returns the last element in this list.
// (1) public E getLast() where E -> data type
// NoSuchElementException - if this list is empty

public class GetLastMethod {
    public static void main(String[] args) {
        LinkedList<String> birds = new LinkedList<>();

        birds.add("Crow");
        birds.add("Hen");
        birds.add("Pigeon");
        birds.add("Sparrow");
        birds.add("Peacock");

        System.out.println(birds);

        System.out.println(birds.getLast());    // peacock
        System.out.println(birds.getLast());    // peacock
    }
}
