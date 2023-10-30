package javaBasics.recursion;

public class CheckSortedArray {
    public static boolean check(int[] arr, int index){
        if(index == arr.length - 1) return true;
//        if(index < arr.length - 1){
//            if(arr[index] > arr[index + 1]){
//                return false;
//            }
//        }
//        return check(arr, ++index);

        return arr[index] < arr[index + 1] && check(arr, ++index);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 7, 8,4};
        boolean result = check(arr, 0);
        System.out.println(result);
    }
}
