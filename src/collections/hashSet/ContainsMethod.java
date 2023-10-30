package collections.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ContainsMethod {
    public static void main(String[] args) {
        String[] str = new String[]{"red", "blue","white", "green", "yellow"};
        HashSet<String> colors = new HashSet<>();
        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(str));
        colors.addAll(colorList);

        System.out.println(colors);
        System.out.println(colors.contains("red")); // true
        System.out.println(colors.contains("purple"));  // false
    }
}
