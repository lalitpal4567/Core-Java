package collections.linkedList;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "anagram";
        String str2 = "nagaram";

        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            else
                map.put(str.charAt(i), 1);
        }
        System.out.println(map);
        for(int i = 0; i < str2.length(); i++){
            if(map.containsKey(str2.charAt(i)))
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
        }
        for(Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
