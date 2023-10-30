package collections.arrayList.initializationByConstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Initialization through ArrayList constructors

public class ListInitializationThroughConstructor {
    public static void main(String[] args) {
        Integer[] cost = new Integer[]{100, 300, 800, 400};

        List<Integer> expenses = Arrays.asList(cost);   // fixed size list (we can't modify it)
        List<Integer> expenses2 = Arrays.asList(new Integer[]{10,20, 30, 40, 50});  // valid
//        expenses.clear();   // UnsupportedOperationException
        System.out.println(expenses);

        System.out.println("\n---------- Method 1 -----------");
        ArrayList<Integer> num2 = new ArrayList<>(expenses);
        System.out.println(num2);

        System.out.println("\n---------- Method 2 -----------");
        ArrayList<Integer> num3 = new ArrayList<>(Arrays.asList(cost));
        System.out.println(num3);

        System.out.println("\n---------- Method 3 -----------");
        ArrayList<Integer> num4 = new ArrayList<>(Arrays.asList(400, 200, 900, 1000));
        System.out.println(num4);

        System.out.println("\n---------- Method 4 -----------");
        ArrayList<Integer> num5 = new ArrayList<>(num4);
        System.out.println(num5);

        System.out.println("\n---------- Method 5 -----------");
        ArrayList<Integer> num6 = new ArrayList<>(new ArrayList<>(num5));
        System.out.println(num6);

        System.out.println("\n---------- Method 6 -----------");
        ArrayList<Integer> num7 = new ArrayList<>(new ArrayList<>(Arrays.asList(cost)));
        System.out.println(num7);

        System.out.println("\n---------- Method 7 -----------");
        ArrayList<Integer> num8 = new ArrayList<>(new ArrayList<>(Arrays.asList(450, 500, 350, 250)));
        System.out.println(num8);

        System.out.println("\n---------- Method 8 -----------");
        ArrayList<Integer> num9 = new ArrayList<>(Arrays.asList(new Integer[]{10, 20, 30, 40}));    // valid
        System.out.println(num9);

        System.out.println("\n---------- Method 9 -----------");
        ArrayList<Integer> num10 = new ArrayList<>(new ArrayList<>(Arrays.asList(new Integer[]{10, 20, 30, 40, 50})));
        System.out.println(num10);

    }
}
