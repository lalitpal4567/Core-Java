package collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IsEmptyMethod {
    public static void main(String[] args) {
        HashSet<Integer> age = new HashSet<>();
        age.add(22);
        age.add(25);
        age.add(15);
        age.add(18);
        age.add(30);

        Iterator<Integer> itr = age.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        boolean output = age.isEmpty();
        System.out.println(output);     // false

        age.clear();
        System.out.println(age.isEmpty());  // true
    }
}
