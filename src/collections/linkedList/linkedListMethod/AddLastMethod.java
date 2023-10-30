package collections.linkedList.linkedListMethod;

// addLast() method is used to insert elements at the end of the list.
// It returns void.
// addLast(T e) and add(T e) are equivalent to each other.
// (1) public void addLast(T e)    // equivalent to add(T e)

import java.util.LinkedList;

public class AddLastMethod {
    public static void main(String[] args) {
        LinkedList<Integer> air = new LinkedList<>();

        air.add(900);
        air.add(584);
        air.add(700);
        System.out.println("All India Rank");
        System.out.println(air);

        air.addLast(842);
        air.addLast(1500);
        System.out.println(air);
    }
}
