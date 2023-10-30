package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// (3) public boolean remove(Object o)
// It removes and returns boolean value

public class RemoveMethod3 {
    public static void main(String[] args) {
        Integer[] leapYear = new Integer[]{2000, 2004, 2008, 2012, 2016, 2020};
        LinkedList<Integer> leap = new LinkedList<>(Arrays.asList(leapYear));
        System.out.println(leap);

        // convert int to Integer object (instance)
        leap.remove(Integer.valueOf(2004)); // true;

        if (leap.remove(Integer.valueOf(2005))) {
            System.out.println("Successfully removed");
        } else {
            System.out.println("Failed to remove");
        }
        System.out.println(leap);
    }
}
