package collections.arrayList.arrayListMethods;

import java.util.ArrayList;

// toArray() method returns Object array (static) of the list (dynamic)
// (1) public Object toArray()

public class ToArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();  // dynamic array

        // adding elements to the list
        for (int i = 0; i < 10; i++) {
            obj.add(i);
        }
        System.out.println(obj);

        Object[] arr = obj.toArray();  // static array
        System.out.println(arr);  // @76ed5528 (reference)

        System.out.println("\nDisplaying the list elements");
        Integer sum = 0;
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
//            sum+= arr[index]; // compilation error
        }
    }
}
