package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// peek() method returns the first element of the list.
// It does not remove the element from the list
// Its equivalent method is element()
// (1) public T peek()

public class PeekMethod {
    public static void main(String[] args) {
        LinkedList<Integer> wholeNum = new LinkedList<>();
        for(int i = 0; i < 10; i++) {
            wholeNum.add(i);
        }
        System.out.println(wholeNum);

        System.out.println(wholeNum.peek());  // 0
        System.out.println(wholeNum.peek());  // 0

        System.out.println(wholeNum);
    }
}
