package collections.arrayList.arrayListMethods;

/**
 * Created by Lalit Pal
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

// subListMethod() returns the portion of this list between the specified fromIndex and toIndex
//(If fromIndex and toIndex are equal, the returned list is empty.)
// It returns list
// (1) public List<E> subList(int fromIndex, int toIndex)

public class SubListMethod {
    public static void main(String[] args) {
        Character[] ch = new Character[]{'2', '6', '7', '3', '1', 'A', 'C', 'X', 'Y', 'Z'};
        List<Character> charList = Arrays.asList(ch);
        ArrayList<Character> character = new ArrayList<>(charList);

        System.out.println(character);
        System.out.println("Length of list is: " + character.size());

        List<Character> list = character.subList(5, 10);  // A C X Y Z
//         ArrayList<String> list = character.subList(5, 11); // IndexOutOfBoundsException
//         ArrayList<String> list = character.subList(5, 5); // prints nothing
//         ArrayList<String> list = character.subList(5, 3); // IllegalArgumentException

        System.out.println("\nDisplaying the list elements");
        ListIterator<Character> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

