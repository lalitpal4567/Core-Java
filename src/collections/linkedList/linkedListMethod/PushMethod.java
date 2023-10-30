package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// push() method inserts the element at the front of the list.
// It does not return anything.
// Its equivalent method is addFirst(E e).
// (1) public void push(E e) [ E -> data type]

public class PushMethod {
    public static void main(String[] args) {
        LinkedList<String> historicalPlace = new LinkedList<>();

        historicalPlace.addAll(Arrays.asList("Taj Mahal", "Qutub Minar", "Red Fort",
                "Agra Fort", "Hawa Mahal"));
        System.out.println(historicalPlace);

        historicalPlace.push("Bibi ka Makbara");
        historicalPlace.push("India Gate");

        System.out.println(historicalPlace);
    }
}
