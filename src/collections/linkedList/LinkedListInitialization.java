package collections.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Initialization of Linked list in different ways

public class LinkedListInitialization {
    public static void main(String[] args) {
        Integer[] arr = {2,3,5,7,4,1};
        List<Integer> list = Arrays.asList(arr);

        System.out.println("Initialization through constructors");
        System.out.println("-------Method 1-------");
        LinkedList<Integer> num1 = new LinkedList<>(list);
        System.out.println(num1);

        System.out.println("-------Method 2--------");
        LinkedList<Integer> num2 = new LinkedList<>(Arrays.asList(arr));
        System.out.println(num2);

        System.out.println("--------Method 3---------");
        LinkedList<Integer> num3 = new LinkedList<>(Arrays.asList(2,4,8,6,5,1));
        System.out.println(num3);

        System.out.println("---------Method 4--------");
        LinkedList<Integer> num4 = new LinkedList<>();
        num4.add(2);
        num4.add(7);
        num4.add(9);
        num4.add(0);
        num4.add(4);
        System.out.println(num4);

        System.out.println("---------Method 5----------");
        LinkedList<Integer> num5 = new LinkedList<>();
        num5.addAll(list);
        System.out.println(num5);

        System.out.println("--------Method 6---------");
        LinkedList<Integer> num6 = new LinkedList<>();
        num6.addAll(Arrays.asList(arr));
        System.out.println(num6);

        System.out.println("----------Method 7----------");
        LinkedList<Integer> num7 = new LinkedList<>();
        num7.addAll(Arrays.asList(2,3,4,5,7,8));
        System.out.println(num7);

        System.out.println("---------Method 8-----------");
        LinkedList<Integer> num8 = new LinkedList<>(num1);
        // LinkedList<Integer> num8 = new LinkedList<>(num2);
        // LinkedList<Integer> num8 = new LinkedList<>(num3);
        // LinkedList<Integer> num8 = new LinkedList<>(num4);
        // LinkedList<Integer> num8 = new LinkedList<>(num5);
        // LinkedList<Integer> num8 = new LinkedList<>(num6);
        System.out.println(num8);
    }
}
