package collections.arrayList.arrayListIteration;

import java.util.ArrayList;

public class IterateArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<>();

        friendList.add("Saya");
        friendList.add("Maya");
        friendList.add("Daya");
        friendList.add("Kaya");
        friendList.add("Jaya");

        // Method 1:
        System.out.println(friendList.get(0));
        System.out.println(friendList.get(1));
        System.out.println(friendList.get(2));
        System.out.println(friendList.get(3));
        System.out.println(friendList.get(4));
//        System.out.println(friendList.get(5));  // IndexOutOfBoundsException
    }
}
