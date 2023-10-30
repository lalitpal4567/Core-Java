package collections.hashMap.hashMapMethod;

import java.util.HashMap;

public class ClearMethod {
    public static void main(String[] args) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        frequency.put(1, 5);
        frequency.put(2, 2);
        frequency.put(3, 7);
        frequency.put(4, 0);
        frequency.put(5, 1);

        System.out.println(frequency);
        frequency.clear();
        System.out.println(frequency);  // {}
    }
}
