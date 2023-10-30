package collections.hashMap.hashMapMethod;

import java.util.HashMap;

public class GetOrDefaultMethod {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 4);
        map.put(2, 7);
        map.put(4, 0);

        System.out.println(map);
        int value = map.getOrDefault(2, 10);    // 7
        int value2 = map.getOrDefault(5, 20);   // 20
        System.out.println(value);
        System.out.println(value2);
    }
}
