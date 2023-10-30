package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// lastIndexOf() method returns the index of the last occurrence of the specified element
// in this list, or -1 if this list does not contain the element.
// (1) public int lastIndexOf(Object o)

public class LastIndexOfMethod {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<String>();

        friends.add("Sachin");
        friends.add("Aman");
        friends.add("Diya");
        friends.add("Anmol");
        friends.add("Tannu");
        friends.add("Aman");
        friends.add("Sachin");
        friends.add("Luvkush");
        friends.add("Aman");
        friends.add("Sachin");

        System.out.println(friends);

        System.out.println(friends.lastIndexOf("Sachin"));  // 9
        System.out.println(friends.lastIndexOf("Aman"));    // 8
        System.out.println(friends.lastIndexOf("Rahul"));   // -1
    }
}
