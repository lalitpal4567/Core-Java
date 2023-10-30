package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// get(int index) method returns the element at the specified location in the list
//IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
// (1) public E get(int index) [ E -> data type ]

public class GetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> year = new ArrayList<>();

        year.add(2000);
        year.add(1994);
        year.add(1990);
        year.add(2014);
        year.add(2022);
        year.add(1999);
        year.add(1997);

        System.out.println(year);
        System.out.println(year.get(4));    // 2022
        System.out.println(year.get(2));    // 1990
        // System.out.println(year.get(10));   // IndexOutOfBoundsException

        System.out.println("-----------------------------");

        if (year.get(1) == 1994) {
            System.out.println("It's my birthday");
        } else {
            System.out.println("I was not born.");
        }
        System.out.println("-----------------------------");

        String wishes = (year.get(6) == 1997) ? "Happy birthday" : "Have a nice day!";
        System.out.println(wishes);
    }
}
