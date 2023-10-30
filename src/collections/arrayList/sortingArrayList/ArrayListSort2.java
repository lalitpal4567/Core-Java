package collections.arrayList.sortingArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Diya");
        names.add("Sachin");
        names.add("Lalit");
        names.add("Azad");
        names.add("Deepesh");

        System.out.println(names);  // [Diya, Sachin, Lalit, Azad, Deepesh]

        //  Sort an ArrayList using its sort() method.
        // You must pass a Comparator to the ArrayList.sort() method.
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(names);  // [Azad, Deepesh, Diya, Lalit, Sachin]
    }
}
