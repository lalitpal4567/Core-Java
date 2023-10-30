package collections.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTraversing {
    public static void main(String[] args) {
        LinkedList<String> companies = new LinkedList<>();
        companies.addAll(Arrays.asList("TCS","Wipro","Google","Microsoft","Amazon","Apple","Dell"));

        System.out.println("Using enhanced for each loop");
        for(Object obj:companies)
        {
            System.out.println(obj);
        }

        System.out.println("Using specific object for each loop");
        for(String str:companies)
        {
            System.out.println(str);
        }

        System.out.println("Using Iterator object");
        Iterator<String> i = companies.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println("Using ListIterator class object");
        System.out.println("Iterating in forward direction in single LL");
        ListIterator<String> ite = companies.listIterator();
        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }

        System.out.println("Iterating in backward direction in double LL");
        while(ite.hasPrevious())
        {
            System.out.println(ite.previous());
        }

        System.out.println("Using lambda expression");
        companies.forEach(value-> System.out.println(value));
    }
}
