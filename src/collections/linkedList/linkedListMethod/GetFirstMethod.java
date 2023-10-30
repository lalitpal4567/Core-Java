package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// getFirst() method returns the first object of the list.
// It does not remove the element.
// Its equivalent method are element(), peek(), peakFirst().
// NoSuchElementException - if this list is empty
// (1) public T getFirst();

public class GetFirstMethod {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("Horse");
        animals.add("Giraffe");
        animals.add("Hippo");
        animals.add("Fox");
        animals.add("Hyna");

        System.out.println(animals);

        System.out.println(animals.getFirst()); // Horse
        System.out.println(animals.getFirst()); // Horse
    }
}
