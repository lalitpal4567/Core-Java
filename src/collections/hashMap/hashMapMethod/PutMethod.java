package collections.hashMap.hashMapMethod;

import java.util.HashMap;

// Put() method adds the specified value with the specified key
// in this map. If the map previously contained a mapping for the key,
// the old value is replaced.
// (1) public V put(K key, V value)

public class PutMethod {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(3, 50);
        map.put(2, 60);

        System.out.println(map.put(5, 20)); // null
        System.out.println(map.put(3, 70)); // 50
        System.out.println(map);
    }
}
