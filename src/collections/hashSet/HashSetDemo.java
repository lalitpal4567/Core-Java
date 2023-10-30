package collections.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        HashSet<String> cities = new HashSet<>();

        names.add("Lalit");
        names.add("Sachin");
        names.add("Ashish");
        names.add("Sachin");    // will not be added

        System.out.println(names);
        names.forEach(System.out::print);
    }
}
