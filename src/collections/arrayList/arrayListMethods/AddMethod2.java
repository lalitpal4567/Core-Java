package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// add(int index, E element) method inserts the specified element at the specified position in this list.
// Shifts the element currently at that position (if any) and any subsequent elements
// to the right (adds one to their indices).
// It throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
// (2) public void add(int index, E element)  // E -> data type

public class AddMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNum = new ArrayList<>();

        evenNum.add(28);
        evenNum.add(30);
        evenNum.add(40);
        System.out.println(evenNum);

        evenNum.add(1, 12);  // insert 12 at index 1
        evenNum.add(4, 16);
        evenNum.add(0, 100);
        // evenNum.add(7,18);  // IndexOutOfBoundsException
        // evenNum.add(-1,20);  // IndexOutOfBoundsException

        System.out.println(evenNum);
    }
}
