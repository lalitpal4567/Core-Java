package collections.arrayList.arrayListIteration;

import java.util.ArrayList;

public class IterateArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<>();

        friendList.add("Saya");
        friendList.add("Maya");
        friendList.add("Daya");
        friendList.add("Kaya");
        friendList.add("Jaya");

//         Method 5:
//         Using lambda expression
         friendList.forEach(n -> System.out.println(n));

        System.out.println("\n");
//        Lambda can be replaced with method reference
         friendList.forEach(System.out::println);
    }
}
