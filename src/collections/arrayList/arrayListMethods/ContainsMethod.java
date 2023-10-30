package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// contains(Object o) method checks whether a specified object is present in the list or not
// It returns boolean value.
// (1) public boolean contains(Object o)

public class ContainsMethod {
    public static void main(String[] args) {
//        List<String> colour = new ArrayList<>();
        ArrayList<String> colour = new ArrayList<>();

        colour.add("Red");
        colour.add("Blue");
        colour.add("White");
        colour.add("Grey");
        colour.add("Yellow");
        colour.add("Green");

        System.out.println(colour);

        boolean isObjectAvailable = colour.contains("Orange");
        System.out.println(colour.contains(isObjectAvailable));  // false
        System.out.println(colour.contains("Yellow"));  // true
        System.out.println(colour.contains("Brown"));   // false

        if (colour.contains("Green")) {
            System.out.println("Green is contained in the list :)");
        } else {
            System.out.println("It does not exist in the list :(");
        }
    }
}
