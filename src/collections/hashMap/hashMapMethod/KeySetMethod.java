package collections.hashMap.hashMapMethod;

import java.util.HashMap;

public class KeySetMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Lalit", 100);
        marks.put("Sachin", 200);
        marks.put("Deepesh", 300);
        marks.put("Ajay", 600);

        System.out.println(marks);
        for(String name : marks.keySet())
            System.out.println(name);

//        ----------------------------------------
        System.out.println(marks.keySet());
    }
}
