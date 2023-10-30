package collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList
{
    public static void main(String[] args) {
        // List<String> friendList = new ArrayList<String>();
        // List<String> friendList = new ArrayList<>();

        ArrayList<String> friendList = new ArrayList<>();

        friendList.add("Saya");
        friendList.add("Maya");
        friendList.add("Daya");
        friendList.add("Kaya");
        friendList.add("Jaya");

        System.out.println(friendList);
        // Method 1:
        // System.out.println(friendList.get(0));
        // System.out.println(friendList.get(1));
        // System.out.println(friendList.get(2));
        // System.out.println(friendList.get(3));
        // System.out.println(friendList.get(4));

        // -------------------------------------------------------------------

        // Method 2:
        // Using standard for loop
        // for(int i=0;i<friendList.size();i++)
        // {
        //     System.out.println(friendList.get(i));
        // }


        // -----------------------------------------------------------------------
        // Method 3:
        // Using enhanced for each loop
        // for(String str : friendList)
        // {
        //     System.out.println(str);
        // }


        // ------------------------------------------------------------------------
        // Method 4:
        // Using object
        // for(Object o : friendList)
        // {
        //     System.out.println(o);
        // }


        // -------------------------------------------------------------------------
        // Method 5:
        // Using lambda expression
        // friendList.forEach(n -> System.out.println(n));


        // -------------------------------------------------------------------------
        // Method 6:
        // creating object of Iterator class by iterator() method
        // Iterator elements = friendList.iterator(); // creating Iterator object
        // Iterator<String> elements = friendList.iterator(); // widely used

        // while(elements.hasNext())
        // {
        //     System.out.println(elements.next());
        // }

        // --------------------------------------------------------------------------
        // Method 7:
        // creating object of ListIterator class by listIterator() method
        ListIterator<String> iterator1 = friendList.listIterator(3);

        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());   // kaya, Jaya
        }

        // --------------------------------------------------------------------------
        // To print all the elements
        System.out.println(friendList);  //  [Saya, Maya, Daya, Kaya, Jaya]

        // using lambda expression
    }
}