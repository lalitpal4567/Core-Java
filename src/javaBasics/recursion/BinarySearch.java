package javaBasics.recursion;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int left, int right){
        if(left >= right) return -1;

        int mid = left + (right - left)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[mid] > key){
            return binarySearch(arr, key, left, mid - 1);
        }
        return binarySearch(arr, key, mid + 1, right);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 9, 15, 22, 43, 65, 69};
        int key = 65;
        int result = binarySearch(arr, key, 0, arr.length - 1);
        System.out.println(result);
    }
}
