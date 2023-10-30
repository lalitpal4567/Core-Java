package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;

// size() method returns the size or number of elements in the list
// (1) public int size()

public class SizeMethod {
    public static void main(String[] args) {
        ArrayList<Integer> oddNum = new ArrayList<>();

        // adding odd elements to the list
        for (int index = 0; index < 20; index++) {
            if (index % 2 != 0) {
                oddNum.add(index);
            }
        }

        // displaying the list elements
        for (int index = 0; index < oddNum.size(); index++) {
            System.out.println(oddNum.get(index));
        }
        System.out.println("Size of oddNum list is: " + oddNum.size());  // 10

        oddNum.clear();
        System.out.println(oddNum.size());  // 0
    }
}
