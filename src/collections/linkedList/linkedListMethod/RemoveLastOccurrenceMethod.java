package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// removeLastOccurrence() method Removes the last occurrence of the
// specified element in this list (when traversing the list from head to tail).
// It returns  boolean value.
// (1) public boolean removeLastOccurrence()

public class RemoveLastOccurrenceMethod {
    public static void main(String[] args) {
        LinkedList<String> productList = new LinkedList<>();

        productList.add("Shampoo");
        productList.add("Soap");
        productList.add("ToothPaste");
        productList.add("Face-wash");
        productList.add("Soap");
        productList.add("Shampoo");
        productList.add("Face-Powder");
        productList.add("Shampoo");
        System.out.println(productList);

        System.out.println(productList.removeLastOccurrence("Soap"));
        System.out.println(productList);

        boolean hasElementRemovedSuccessfully = productList.removeLastOccurrence("Perfume");

        if (hasElementRemovedSuccessfully) {
            System.out.println("Successfully removed");
        } else {
            System.out.println("element does not exist.");
        }
    }
}
