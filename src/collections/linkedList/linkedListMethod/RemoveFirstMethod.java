package collections.linkedList.linkedListMethod;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// removeFirst() method removes and returns the first element of the list.
// Equivalent methods are pop() and remove().
//NoSuchElementException - if this list is empty
// (1) public T removeFirst()

public class RemoveFirstMethod {
    public static void main(String[] args) {
        String[] arr = {"Earth", "Jupiter", "Mars", "Pluto", "Saturn", "Uranus", "Mercury"};
        List<String> planetList = Arrays.asList(arr);
        LinkedList<String> planets = new LinkedList<>(planetList);

        System.out.println(planets);

        System.out.println(planets.removeFirst()); // Earth
        System.out.println(planets.removeFirst());  // Jupiter

        System.out.println(planets);
    }
}
