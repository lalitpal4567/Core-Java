package collections.linkedList.linkedListMethod;

import java.util.LinkedList;
import java.util.List;

// contains() method checks whether a given object is present in the list or not
// It returns boolean value.
// (1) public boolean contains(Object o)

public class ContainsMethod {
    public static void main(String[] args) {
        List<String> flowers = new LinkedList<String>();
        flowers.add("Marigold");
        flowers.add("Rose");
        flowers.add("Lotus");
        flowers.add("Tulip");
        flowers.add("Jasmine");
        System.out.println(flowers);

        System.out.println(flowers.contains("Tulip")); // true
        System.out.println(flowers.contains("Rose"));   // true
        System.out.println(flowers.contains("Sunflower"));  // false
    }
}
