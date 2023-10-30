package collections.arrayList.arrayListMethods;

import java.util.ArrayList;

// trimToSize() method trims the capacity of this ArrayList instance to be the list's current size.
// An application can use this operation to minimize the storage of an ArrayList instance.
// (1) public void trimToSize()

public class TrimToSizeMethod {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>(20);   // initial capacity = 20

        subjects.add("Maths");
        subjects.add("English");
        subjects.add("Hindi");
        subjects.add("Sanskrit");
        subjects.add("Drawing");
        subjects.add("GK");
        subjects.add("Physics");

        System.out.println(subjects);
        System.out.println("Size of list: " + subjects.size());
        subjects.trimToSize();  //
        System.out.println("Trimmed capacity is: " + (20 - subjects.size()));
        System.out.println("New Capacity will be: " + subjects.size());
    }
}
