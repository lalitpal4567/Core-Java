package javaBasics.recursion;

import java.util.ArrayList;
import java.util.Arrays;

// return the array of index of a specified key
public class ReturnArray {
    public static int[] search(int[] arr, int[] indexArray, int key, int index, int keyIndex){
        if(index == arr.length) return indexArray;
        if(arr[index] == key){
            indexArray[keyIndex++] = index;
        }
        return search(arr, indexArray, key, ++index, keyIndex);
    }

    public static ArrayList search2(int[] arr, int key, int index, ArrayList list){
        if(index == arr.length) return list;
        if(arr[index] == key) list.add(index);
        return search2(arr, key, ++index, list);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 8, 10, 14, 4};
        int[] indexArray = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        int key = 4;
        indexArray = search(arr, indexArray, key, 0, 0);
//        list = search2(arr, key, 0, list);
        System.out.println(Arrays.toString(indexArray));
//        System.out.println(list);
    }
}
