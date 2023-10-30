package modifiers.nonAccessModifier.finalKeyword;

import java.util.Arrays;
public class FinalDemo2 {
    public static void main(String[] args) {
        final int[] arr = new int[]{2, 3, 6, 2, 1, 0};
        int[] arr2 = new int[]{5, 6, 7, 3, 1, 9};

//        arr = arr2;     // compilation error

        System.out.println(Arrays.toString(arr));
        arr[0] = 40;
        arr[3] = 30;
        System.out.println(Arrays.toString(arr));
    }
}
