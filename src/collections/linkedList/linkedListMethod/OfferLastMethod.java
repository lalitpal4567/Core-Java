package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// offerLast(Object o) method adds the specified element at the end of the list.
// It returns boolean value.
// Its equivalent methods addLast(Object o).
// (1) public boolean offerLast(Object o)

public class OfferLastMethod {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        books.add("Math");
        books.add("English");
        books.add("Hindi");
        books.add("History");
        books.add("Drawing");

        LinkedList<String> subjects = new LinkedList<>();
        subjects.addAll(books);
        System.out.println(subjects);

        System.out.println(subjects.offerLast("General Knowledge"));
        System.out.println(subjects.offerLast("Computer"));

        System.out.println(subjects);
    }
}
