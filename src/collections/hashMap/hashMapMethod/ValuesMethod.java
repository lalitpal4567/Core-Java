package collections.hashMap.hashMapMethod;

import java.util.HashMap;

public class ValuesMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Lalit", 33);
        marks.put("Pulkit", 40);
        marks.put("Azad", 39);
        marks.put("Deepesh",45);

        System.out.println(marks);
        System.out.println(marks.values());

        for(Integer value : marks.values()){
            if(marks.containsKey("Lalit")){
                marks.put("Lalit", marks.get("Lalit") + 1);
            }
        }
        System.out.println(marks);
    }
}
