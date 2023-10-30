package collections.hashMap.hashMapMethod;

import java.util.HashMap;

public class MapUseCase {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[]{1, 2, 3, 2, 3, 5, 2, 6, 8, 4, 6, 5};
        Integer[] arr2 = new Integer[]{1, 2, 3, 2, 3, 5, 2, 55,6, 8, 7, 4, 6, 5};

        for(int value : arr2){
            if(map.containsKey(value))
                map.put(value, map.get(value) + 1);
            else map.put(value, 1);
        }
        for(int value : arr){
            if(map.containsKey(value))
                map.put(value, map.get(value) - 1);
        }
        for(int value : map.keySet())
            if(map.get(value) == 1)
                System.out.println(value);
    }
}
