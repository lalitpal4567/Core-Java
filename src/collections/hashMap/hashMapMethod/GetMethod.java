package collections.hashMap.hashMapMethod;

import java.util.HashMap;

public class GetMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Lalit", 33);
        marks.put("Sachin", 44);
        marks.put("Shivam", 48);
        marks.put("Azad", 45);

        System.out.println(marks);

        System.out.println(marks.get("Sachin"));    // 44
        System.out.println(marks.get("Deepesh"));   // null
    }
}
