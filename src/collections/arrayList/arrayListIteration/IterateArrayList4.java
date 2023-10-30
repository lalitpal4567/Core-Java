package collections.arrayList.arrayListIteration;

import java.util.ArrayList;

public class IterateArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<>();

        friendList.add("Saya");
        friendList.add("Maya");
        friendList.add("Daya");
        friendList.add("Kaya");
        friendList.add("Jaya");

//        Method 4:
//        using enhanced for each loop
//        an Object class reference variable can hold the reference of any object.
         for(Object o : friendList)
         {
             System.out.println(o);
         }
    }
}
