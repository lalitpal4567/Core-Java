package collections.linkedList.linkedListMethod;

import java.util.LinkedList;
import java.util.Random;

// size() method returns the number of elements in this list.
// (1) public int size()

public class SizeMethod {
    public static void main(String[] args) {
        Random randomSalary = new Random();
        LinkedList<Float> salary = new LinkedList<>();

        for (int index = 0; index < 5; index++) {
            salary.add(randomSalary.nextFloat(10000, 100000));
        }
        System.out.println(salary);
        System.out.println("Size: " + salary.size());
    }
}
