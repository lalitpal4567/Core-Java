package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// get() method returns an object at a specified position
// (1) public T get(int index)

public class GetMethod {
    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();

        data.add(100);
        data.add(200);
        data.add(300);
        data.add(400);
        data.add(500);

        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(5));    // IndexOutOfBoundsException

        for (int index = 0; index < data.size(); index++) {
            System.out.print(data.get(index) + " ");
        }

        System.out.println("\n" + data);
    }
}
