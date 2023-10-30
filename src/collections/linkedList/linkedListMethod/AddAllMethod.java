package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// addAll() method appends all of the elements in the specified collection to the end of this list.
// It returns boolean value.
//(1) public boolean addAll()

public class AddAllMethod {
    public static void main(String[] args) {
        String[] arr = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        // Object[] arr2 = {3,"Hi",'M',5.5F};
        LinkedList<String> week = new LinkedList<String>();
        week.addAll(Arrays.asList(arr));
        System.out.println(week);

    }
}
