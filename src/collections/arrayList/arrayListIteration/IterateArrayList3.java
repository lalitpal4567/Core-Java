package collections.arrayList.arrayListIteration;

import java.util.ArrayList;

public class IterateArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<>();

        friendList.add("Saya");
        friendList.add("Maya");
        friendList.add("Daya");
        friendList.add("Kaya");
        friendList.add("Jaya");

//         Method 3:
//         Using enhanced for each loop
         for(String str : friendList)
         {
             System.out.println(str);
         }
    }
}
