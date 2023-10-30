package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// set(int index, E element) method replaces the element at the
// specified position in this list with the specified element.
// It returns the element previously at the specified position.
// It throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
// (1) public string set(int index, E element)

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();

        city.add("Noida");
        city.add("Ghaziabad");
        city.add("Bangalore");
        city.add("Hyderabad");
        city.add("Chennai");

        System.out.println(city);

        System.out.println(city.set(1, "Gurgaon")); // Ghaziabad
        city.set(3, "Mumbai");   // Hyderabad
//        city.set(6, "Mumbai");  // IndexOutOfBoundsException

        System.out.println("\nDisplaying the list elements");
        Object[] obj = city.toArray();

        for (Object o : obj) {
            System.out.println(o);
        }
    }
}
