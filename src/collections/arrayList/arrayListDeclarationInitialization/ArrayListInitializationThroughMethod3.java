package collections.arrayList.arrayListDeclarationInitialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Different ways to initialize the ArrayList

public class ArrayListInitializationThroughMethod3 {
    public static void main(String[] args) {
        String[] friendList = new String[]{"Sachin", "Chandan", "Shahrukh", "Azad"};

        List<String> bestFriends = Arrays.asList(friendList);

//        List<String> bestFriends;
//        bestFriends.addAll(friendList); // error
        System.out.println(bestFriends);

        System.out.println("\n---------- Method 1 -----------");
        ArrayList<String> bestFriends2 = new ArrayList<>();
        bestFriends2.addAll(bestFriends);
        System.out.println(bestFriends2);

        System.out.println("\n---------- Method 2 -----------");
        ArrayList<String> bestFriends3 = new ArrayList<>();
        bestFriends3.addAll(Arrays.asList(friendList));
        System.out.println(bestFriends3);

        System.out.println("\n---------- Method 3 -----------");
        ArrayList<String> bestFriends4 = new ArrayList<>();
        bestFriends4.addAll(Arrays.asList("Shahrukh", "Azad", "Siddharth"));
        System.out.println(bestFriends4);

        System.out.println("\n---------- Method 4 -----------");
        // Initialization of ArrayList using existing ArrayList
        ArrayList<String> bestFriends5 = new ArrayList<>();
        bestFriends5.addAll(bestFriends4);
        System.out.println(bestFriends5);

        System.out.println("\n---------- Method 5 -----------");
        ArrayList<String> bestFriends6 = new ArrayList<>();
        bestFriends6.addAll(new ArrayList<>(bestFriends5));
        System.out.println(bestFriends6);

        System.out.println("\n---------- Method 6 -----------");
        ArrayList<String> bestFriends7 = new ArrayList<>();
        bestFriends7.addAll(new ArrayList<>(Arrays.asList(friendList)));
        System.out.println(bestFriends7);

        System.out.println("\n---------- Method 7 -----------");
        ArrayList<String> bestFriends8 = new ArrayList<>();
        bestFriends8.addAll((new ArrayList<>(Arrays.asList("Ajay", "Ashish", "Bharat"))));
        System.out.println(bestFriends8);
    }
}
