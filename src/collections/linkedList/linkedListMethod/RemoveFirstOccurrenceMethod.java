package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// removeFirstOccurrence() method Removes the first occurrence of the
// specified element in this list (when traversing the list from head to tail).
// If the list does not contain the element, it is unchanged.
// It returns boolean value.
// (1) public boolean removeFirstOccurrence()

public class RemoveFirstOccurrenceMethod {
    public static void main(String[] args) {
        String[] arr = {"New Delhi", "Bangalore", "Mumbai", "New York", "Mumbai",
                "Los Angeles", "California", "Mumbai", "Noida"};
        LinkedList<String> city = new LinkedList<String>(Arrays.asList(arr));
        System.out.println(city);

        System.out.println(city.removeFirstOccurrence("Mumbai")); // true
        System.out.println(city);

        System.out.println(city.removeFirstOccurrence("Mumbai")); // true
        System.out.println(city);

        System.out.println(city.removeFirstOccurrence("Mumbai")); // true
        System.out.println(city);

        System.out.println(city.removeFirstOccurrence("Mumbai")); // false
        System.out.println(city);
    }
}
