package collections.arrayList.arrayListIteration;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateArrayList7 {
    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<>();

        friendList.add("Saya");
        friendList.add("Maya");
        friendList.add("Daya");
        friendList.add("Kaya");
        friendList.add("Jaya");

//         Method 7:

//         (1) public ListIterator<E> listIterator()
//         creating object of ListIterator class by listIterator() method
        ListIterator<String> iterator1 = friendList.listIterator();

        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }


//         (2) public ListIterator<E> listIterator(int index)
//         The specified index would be the first element from where the rest
//         of the elements would start printing

        System.out.println("\n");
        ListIterator<String> iterator2 = friendList.listIterator(2);
        while(iterator2.hasNext())
        {
            System.out.println(iterator2.next());   // Daya Kaya Jaya
        }
    }
}
