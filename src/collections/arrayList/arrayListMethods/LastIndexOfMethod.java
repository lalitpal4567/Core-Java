package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// lastIndexOf(Object o) method returns the index of the last occurrence of the
// specified element in this list, or -1 if this list does not contain the element.
// More formally, returns the highest index i such that (o==null ? get(i)==null : o.equals(get(i))),
// or -1 if there is no such index.
// (1) public int lastIndexOf(Object o)

public class LastIndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> counting = new ArrayList<>();

        counting.add(30);
        counting.add(50);
        counting.add(20);
        counting.add(70);
        counting.add(20);
        counting.add(50);
        counting.add(60);
        counting.add(20);
        counting.add(40);
        counting.add(90);

        System.out.println(counting.lastIndexOf(20));  // 7
        System.out.println(counting.lastIndexOf(50));  // 5
        System.out.println(counting.lastIndexOf(100)); // returns -1
    }
}
