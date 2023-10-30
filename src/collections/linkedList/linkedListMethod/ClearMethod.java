package collections.linkedList.linkedListMethod;

// clear() method deletes all the elements in the list
// It returns nothing
// (1) public void clear()

import java.util.LinkedList;

public class ClearMethod {
    public static void main(String[] args) {
        LinkedList<Integer> age = new LinkedList<>();

        age.add(23);
        age.add(20);
        age.addLast(18);
        age.addLast(15);
        age.addFirst(100);
        age.addFirst(105);
        age.add(2, 30);
        age.add(0, 106);
        System.out.println(age);

        age.remove();
        age.removeFirst();
        age.pop();
        System.out.println(age);

        age.clear(); // removes all elements in the list
        System.out.println(age);

        // displaying the list elements using listIterator() method
        // ListIterator<Integer> iterator = age.listIterator();
        // while(iterator.hasNext())
        // {
        //     System.out.print(iterator.next()+"  ");
        // }

        System.out.println("Is list empty? " + age.isEmpty());
    }
}
