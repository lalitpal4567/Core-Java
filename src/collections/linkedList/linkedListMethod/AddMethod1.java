package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// add() method is used to insert elements at the end of the list.
// It returns boolean value;
// (1) public boolean add(T e)     // returns boolean value

// add() method which takes index as an argument is used to insert element at specified location.
// It returns nothing.
// (2) public void add(int index, T e)
// T-> datatype: Integer, Character, Float, Double, Short, String, Long and so on.

public class AddMethod1 {
    public static void main(String[] args) {
        LinkedList<String> rainbowColors = new LinkedList<>();

        // (1) public boolean add(T a)
        rainbowColors.add("Violet");
        rainbowColors.add("Indigo");
        rainbowColors.add("Blue");
        rainbowColors.add("Green");
        rainbowColors.add("Yellow");
        rainbowColors.add("Orange");
        boolean status = rainbowColors.add("Red");

        if (status) {
            System.out.println("Successfully inserted.");
        } else {
            System.out.println("failed to insert.");
        }

        System.out.println(rainbowColors);
    }
}
