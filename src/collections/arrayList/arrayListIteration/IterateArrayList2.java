package collections.arrayList.arrayListIteration;

import java.util.ArrayList;

public class IterateArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<>();

        friendList.add("Saya");
        friendList.add("Maya");
        friendList.add("Daya");
        friendList.add("Kaya");
        friendList.add("Jaya");

//         Method 2:
//         Using standard for loop
         for(int index = 0; index < friendList.size(); index++)
         {
             System.out.println(friendList.get(index));
         }
    }
}
