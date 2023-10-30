package collections.arrayList.arrayListDeclarationInitialization;


import java.util.ArrayList;
import java.util.ListIterator;

// add(E e) method is used to add objects at the end of the list
// (1) public boolean add(E e) [ E -> data type ]
// (2) public void add(int index, Object/E element)  // E -> data type

public class ArrayListInitializationThroughMethod1 {
    public static void main(String[] args) {
        ArrayList<Character> alphabet = new ArrayList<>();

        alphabet.add('W');
        alphabet.add('e');
        alphabet.add('l');
        alphabet.add('c');
        alphabet.add('o');
        alphabet.add('m');
        alphabet.add('e');

        System.out.println(alphabet);

        // displaying the list using listIterator method
        ListIterator<Character> iterator = alphabet.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
