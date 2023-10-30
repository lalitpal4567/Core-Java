package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// remove(int index) method removes the element at the specified position in this list.
// Shifts any subsequent elements to the left (subtracts one from their indices).
// It returns the element that was removed from the list
// It throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
// (2) public E remove(int index) [ E -> data type ]

public class RemoveMethod2 {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");

        System.out.println(months);

        months.remove(0);   // January
        months.remove(2);   // April
        System.out.println(months.remove(2)); // May

        System.out.println(months);
    }
}