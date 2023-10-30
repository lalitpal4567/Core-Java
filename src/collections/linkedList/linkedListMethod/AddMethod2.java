package collections.linkedList.linkedListMethod;

// add() method which takes index as an argument is used to insert element at specified location.
// (2) public void add(int index, T e)
// It does not return anything. (void)
// T-> datatype: Integer, Character, Float, Double, Short, String, Long and so on.

import java.util.LinkedList;

public class AddMethod2 {
    public static void main(String[] args) {
        LinkedList<String> touristPlaces = new LinkedList<>();

        touristPlaces.add("India Gate");
        touristPlaces.add("Red Fort");
        touristPlaces.add("Lotus Temple");
        System.out.println(touristPlaces);

        touristPlaces.add(0, "AksharDham Temple");
        touristPlaces.add(4, "Taj Mahal");
        touristPlaces.add(6, "Qutub Minar");    // IndexOutOfBoundsException
        System.out.println(touristPlaces);
    }
}
