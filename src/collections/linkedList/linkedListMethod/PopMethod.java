package collections.linkedList.linkedListMethod;

// pop() method removes and returns the first element of the list.
// It returns the element at the front of this list (which is the top of the
// stack represented by this list)
// Equivalent method is remove() and removeFirst().
// (1) public T pop()

import java.util.LinkedList;

public class PopMethod {
    public static void main(String[] args) {
        LinkedList<String> vegetables = new LinkedList<>();

        vegetables.add("Onion");
        vegetables.add("Brinjal");
        vegetables.add("Potato");
        vegetables.add("Raddish");
        vegetables.add("Carrot");
        vegetables.add("Cucumber");
        vegetables.add("Spinach");
        vegetables.add("Cauliflower");
        System.out.println(vegetables);

        System.out.println(vegetables.pop());   // Onion
        String str = vegetables.pop();
        System.out.println(str);

        System.out.println(vegetables);
    }
}
