package javaBasics.array.oneD.intArray;

public class OddValue {
    public static void display(Integer[] arr){
        for(int value : arr){
//            System.out.println(value);
            System.out.printf("%s", value);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{222, 220, 010};
        Integer[] arr2 = new Integer[]{222, 220, 010};
//        display(arr);   // compilation error
        display(arr2);    //  2222208
    }
}
