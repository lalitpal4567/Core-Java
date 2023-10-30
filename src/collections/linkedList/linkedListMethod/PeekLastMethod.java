package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// peekLast() method return the last element of the list.
// It does not remove the element from the list.
//(1) public T peekLast()

public class PeekLastMethod {
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<>();
        color.add("White");
        color.add("Brown");
        color.add("Grey");
        color.add("Orange");
        color.add("Violet");
        color.add("Magenta");
        color.add("Sky blue");
        System.out.println(color);

        System.out.println(color.peekLast());   // Sky blue
        System.out.println(color.peekLast());   // Sky blue
    }
}
