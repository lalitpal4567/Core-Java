package javaBasics.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfIndexArrayList {
    public static ArrayList<Integer> search(int[] arr, int key, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) return list;
        if(arr[index] == key) list.add(index);
        list.addAll(search(arr, key, ++index));
        return list;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 4, 8, 4};
        int key = 4;
        ArrayList list = search(arr, key, 0);
        System.out.println(list);
    }
}
