package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// (2) public T remove(int index)
// It removes and returns element at specified index.
// remove() method is equivalent to pop() and removeFirst().

public class RemoveMethod2 {
    public static void main(String[] args) {
        String[] fruitsList = new String[]{"Orange", "Apple", "Banana", "Papaya", "Litchi", "Guava"};
        LinkedList<String> fruits = new LinkedList<>(Arrays.asList(fruitsList));
        System.out.println(fruits);

        fruits.remove(2);   // Banana
        System.out.println(fruits.remove(0)); // Orange
//        fruits.remove(5);   // IndexOutOfBoundsException
        System.out.println(fruits);
    }
}
