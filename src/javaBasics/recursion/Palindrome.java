package javaBasics.recursion;

// not working
public class Palindrome {
    public static boolean palindrome(int[] arr, int left, int right){
        if(left > right){
            return false;
        }
        if(arr[left] == arr[right]){
            return palindrome(arr, ++left, -- right);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 1, 2, 3};
        boolean result = palindrome(arr, 0, arr.length - 1);
        System.out.println(result);
    }
}
