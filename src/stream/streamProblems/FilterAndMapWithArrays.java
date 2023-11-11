package stream.streamProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given a list of arrays of integers, filter out arrays with a length less than or equal to 4,
// and then transform the remaining arrays to a list of their sums.
public class FilterAndMapWithArrays {
    public static void main(String[] args) {
        ArrayList<int[]> array = new ArrayList<>();
        array.add(new int[]{2,5,2,7,8});
        array.add(new int[]{7,8,3});
        array.add(new int[]{1,3});
        array.add(new int[]{});
        array.add(new int[]{5,6,7,4,2,7,8,9,3,2});
        array.add(new int[]{7,5,5,3});
        array.add(new int[]{5,3,0,0,0,0});
        array.add(new int[]{0});


        List<Integer> sum = array.stream()
                .filter(arr -> arr.length <= 4)
                .map(arr -> Arrays.stream(arr).sum())
                .toList();

        for (Integer integer : sum) {
            System.out.println(integer);
        }

    }
}
