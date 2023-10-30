package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// remove(Object o) Removes the first occurrence of the specified element from this list,
// if it is present. If the list does not contain the element, it is unchanged.
// First method which accepts the objects returns boolean value.
// (1) public boolean remove(Object o)


// remove(int index) method removes the element at the specified position in this list.
// Shifts any subsequent elements to the left (subtracts one from their indices).
// It throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
// (2) public void remove(int index)

public class RemoveMethod1 {
    public static void main(String[] args) {
        // (1) public boolean remove(Object o)

        ArrayList<String> months = new ArrayList<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");

        System.out.println(months);

        months.remove("February"); // true
        months.remove("April");     // true
        System.out.println(months.remove("July")); // false
        System.out.println(months.remove("january"));   // false

        System.out.println("\nDisplaying list elements");
        months.forEach(calender -> System.out.println(calender));

        System.out.println(months.remove("December") ? "removed successfully :)" : "does not exist :(");
    }
}
