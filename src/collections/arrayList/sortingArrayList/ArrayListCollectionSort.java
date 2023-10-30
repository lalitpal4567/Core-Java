package collections.arrayList.sortingArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Sorting using Collection interface method

public class
ArrayListCollectionSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(10);
        numbers.add(8);
        numbers.add(7);
        numbers.add(5);
        numbers.add(1);

        System.out.println(numbers);    // [13, 10, 8, 7, 5, 1]

        Collections.sort(numbers);

        System.out.println(numbers);    // [1, 5, 7, 8, 10, 13]
    }
}
