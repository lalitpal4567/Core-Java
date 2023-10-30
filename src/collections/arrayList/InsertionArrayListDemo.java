package collections.arrayList;

import java.util.ArrayList;

public class InsertionArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);
        System.out.println(odd);    // [1, 3, 5, 7, 9]

        ArrayList<Integer> numbers = new ArrayList<>(odd);
        System.out.println(numbers);    // [1, 3, 5, 7, 9]

        ArrayList<Integer> even = new ArrayList<>();
        even.add(0);
        even.add(2);
        even.add(4);

        numbers.addAll(even);
        System.out.println(numbers);    // [1, 3, 5, 7, 9, 0, 2, 4]

        ArrayList<Integer> any = new ArrayList<>();
        any.add(8);
        any.add(11);
        any.add(13);

        numbers.addAll(5, any);
        numbers.add(0,0);
        System.out.println(numbers);    // [0, 1, 3, 5, 7, 9, 8, 11, 13, 0, 2, 4]
    }
}
