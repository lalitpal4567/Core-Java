package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// clear() method removes all the elements from the list.
// (1) public void clear()

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(34);
        marks.add(50);
        marks.add(20);
        marks.add(33);
        marks.add(45);

        System.out.println(marks);
        marks.clear();  // deletes all the elements
        System.out.println(marks);

        System.out.println("Is list empty? " + (marks.isEmpty() ? "Yes" : "No"));
    }
}
