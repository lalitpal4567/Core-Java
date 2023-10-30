package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// add(E e) method is used to add elements at the end of the list.
// It returns boolean value either true or false.
// (1) public boolean add(E e)
// (2) public void add(int index, E element)  // E -> data type

public class AddMethod1 {
    public static void main(String[] args) {
//        List<Integer> num = new ArrayList<Integer>(); // valid
//        List<Integer> num = new ArrayList<>();   // valid

        ArrayList<Integer> evenNum = new ArrayList<>(); // widely used

        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);
        System.out.println(evenNum.add(8)); // returns true

        if (evenNum.add(10)) {
            System.out.println("added successfully :)");
        } else {
            System.out.println("failed to add :(");
        }
        System.out.println(evenNum);

        // displaying elements using lambda expression
        System.out.println("\nUsing lambda expression");
        evenNum.forEach(value -> System.out.println(value));
    }
}
