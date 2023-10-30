package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// indexOf() method returns the index of the first occurrence of the specified element
// in this list, or -1 if this list does not contain the element.
// (1) public int indexOf(Object o);

public class IndexOfMethod {
    public static void main(String[] args) {
        LinkedList<String> flowersName = new LinkedList<>(Arrays.asList("Jasmine", "Lotus", "Rose", "Marigold", "Rose", "Sunflower"));

        flowersName.add("Daisy");
        System.out.println(flowersName);

        System.out.println(flowersName.indexOf("Rose"));
        System.out.println(flowersName.indexOf("Balsam")); // -1
    }
}
