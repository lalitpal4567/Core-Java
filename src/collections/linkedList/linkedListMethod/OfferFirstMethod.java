package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// offerFirst() method adds the specified element at the front of the list.
// It returns boolean value.
// Its equivalent methods are addFirst(Object o), add(Object o), push(Object o)
// (1) public boolean offerFirst(Object o)

public class OfferFirstMethod {
    public static void main(String[] args) {
        LinkedList<Character> city = new LinkedList<>();
        city.addAll(Arrays.asList('d','e','r','a','b','a','d'));
        System.out.println(city);

        System.out.println(city.offerFirst('y'));
        System.out.println(city.offerFirst('H'));

        System.out.println(city);
    }
}
