package javaBasics.recursion;

public class LinearSearch {
    public static boolean search(int[] arr, int key, int index){
        if(index == arr.length - 1 && key != arr[index]) return false;
//        if(key == arr[index]) return true;
//        return search(arr, key, ++index);

      return key == arr[index] || search(arr, key, ++index);
    }

    public static boolean search2(int[] arr, int key, int index){
        if(index == arr.length) return false;
        return key == arr[index] || search(arr, key, ++index);
    }
    public static int search3(int[] arr, int key, int index){
        if(index == arr.length) return -1;
        if(key == arr[index]) return index;
        return search3(arr, key, ++index);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 6, 4, 7, 11, 23, 13};
        int key = 13;
        boolean result = search2(arr, key, 0);
        int result2 = search3(arr, key, 0);
        System.out.println(result);
        System.out.println(result2);
    }
}
