package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// indexOf(Object o) method returns the index of the first occurrence of the
// specified element in this list, or -1 if this list does not contain the
// element. More formally, returns the lowest index i such that (o==null ? get(i)==null : o.equals(get(i))),
// or -1 if there is no such index.
// (1) public int indexOf(Object o)

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<String> week = new ArrayList<>();

        week.add("Sunday");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");

        System.out.println(week.indexOf("Wednesday"));  // 3
        System.out.println(week.indexOf("Sunday"));     // 0
        System.out.println(week.indexOf("January"));    // -1

        // 'week.indexOf("July") > 1' can be replaced with 'week.contains("July")'
        if (week.indexOf("July") > -1) {
            System.out.println("It exists");
        } else {
            System.out.println("It does not exist.");
        }
    }
}
