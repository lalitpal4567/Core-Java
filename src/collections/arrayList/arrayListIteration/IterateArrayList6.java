package collections.arrayList.arrayListIteration;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<String>();

        friendList.add("Saya");
        friendList.add("Maya");
        friendList.add("Daya");
        friendList.add("Kaya");
        friendList.add("Jaya");

//        Method 6:
//        creating object of Iterator class by iterator() method
//        iterator() method returns the object of Iterator class
//        Iterator elements = friendList.iterator(); // creating Iterator object

         Iterator<String> elements = friendList.iterator(); // (generic) widely used
         while(elements.hasNext()) {
             System.out.println(elements.next());
         }
    }
}
