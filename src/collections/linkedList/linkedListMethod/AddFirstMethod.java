package collections.linkedList.linkedListMethod;

// addFirst() method inserts the element at the beginning of the list.
// It returns nothing.
// (1) public void addFirst(E e) [ E -> data type ]

import java.util.LinkedList;

public class AddFirstMethod {
    public static void main(String[] args) {
        LinkedList<Float> weightInKg = new LinkedList<>();

        weightInKg.add(65.5f);
        weightInKg.add(50.00f);
        weightInKg.add(78.3f);
        System.out.println(weightInKg);

        weightInKg.addFirst(45.7f);
        System.out.println(weightInKg);

        weightInKg.addFirst(51.50f);
        ;
        System.out.println(weightInKg);
    }
}
