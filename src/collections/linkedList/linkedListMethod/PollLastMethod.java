package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// pollLast() method removes and returns the last element of the list.
// (1) public T pollLast()

public class PollLastMethod {
    public static void main(String[] args) {
        LinkedList<Integer> familyMembers = new LinkedList<Integer>();
        familyMembers.add(2);
        familyMembers.add(3);
        familyMembers.add(4);
        familyMembers.add(7);
        familyMembers.add(1);
        familyMembers.add(6);
        System.out.println(familyMembers);

        System.out.println(familyMembers.pollLast()); // 6
        System.out.println(familyMembers.pollLast()); // 1

        System.out.println(familyMembers);
    }
}
