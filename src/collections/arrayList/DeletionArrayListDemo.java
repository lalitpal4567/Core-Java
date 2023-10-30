package collections.arrayList;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DeletionArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<>();

        language.add("C");
        language.add("C++");
        language.add("Java");
        language.add("Python");
        language.add("R");
        language.add("Spark");

        System.out.println(language);   // [C, C++, Java, Python, R, Spark]

        language.remove(5);
        System.out.println(language);   // [C, C++, Java, Python, R]

        boolean status = language.remove("smalltalk");
        System.out.println("small talk is removed: " + status); // small talk is removed: false

        ArrayList<String> script = new ArrayList<>();
        script.add("SQL");
        script.add("Python");
        script.add("JavaScript");

        language.removeAll(script); // removes the intersection of language and script collection
        System.out.println(language);   // [C, C++, Java, R]

        // Remove all the elements that satisfy the given condition
        language.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        });

        // or
//        language.removeIf(s -> s.startsWith("C"));

        System.out.println(language);   // [Java, R]

        language.clear();
        System.out.println(language);   // []
    }
}
