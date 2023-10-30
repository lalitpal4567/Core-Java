package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// isEmpty() method tells whether a list is empty or not
// It returns boolean value either true or false
// (1)  public boolean isEmpty()

public class IsEmptyMethod {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        // adding elements to the num list
        for (int index = 10; index <= 50; index += 10) {
            num.add(index);
        }

        System.out.println(num);
        num.remove(2);  // will remove 30
//        num.remove(7);  // IndexOutOfBoundsException
        System.out.println(num);

        System.out.println("\nIs list empty? " + num.isEmpty());  // false
        System.out.println(num.isEmpty() ? "It is empty" : "It is not empty.");

        num.clear();    // removes all elements
        System.out.println(num);
        System.out.println("Is list empty? " + num.isEmpty());  // true
    }
}

