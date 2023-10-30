package collections.hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveMethod {
    public static void main(String[] args) {
        HashSet<String> courses = new HashSet<>();
        courses.addAll(Arrays.asList("Java", "C++", "C", "Python", "React"));
        System.out.println(courses);

        courses.remove("C");    // true
        System.out.println(courses);

        courses.remove("C#");   // false
        System.out.println(courses);
    }
}
