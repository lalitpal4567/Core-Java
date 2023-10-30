package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// peekFirst() method returns the first element.
// It doesn't remove the element from the list.
// (1) public T peekFirst()  // equivalent to peek() method

public class PeekFirstMethod {
    public static void main(String[] args) {
        LinkedList<Integer> marks = new LinkedList<Integer>();
        marks.add(54);
        marks.add(45);
        marks.add(70);
        marks.add(89);
        marks.add(65);
        System.out.println(marks);

        System.out.println(marks.peekFirst());  // 54
        System.out.println(marks.peekFirst());  // 54

        System.out.println(marks);
    }
}
