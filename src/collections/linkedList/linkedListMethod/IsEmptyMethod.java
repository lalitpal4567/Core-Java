package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// isEmptyMethod() method checks whether a given list is empty or not
// It returns boolean value
// (1) public T getLast()

public class IsEmptyMethod {
    public static void main(String[] args) {
        LinkedList<Character> name = new LinkedList<>();
        name.add('M');
        name.add('o');
        name.add('w');
        name.add('g');
        name.add('l');
        name.add('i');
        System.out.println(name);

        System.out.println(name.isEmpty()); // false

        name.clear();
        System.out.println(name.isEmpty()); // true

    }
}
