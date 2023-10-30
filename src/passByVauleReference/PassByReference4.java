package passByVauleReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PassByReference4 {
    public static void missingNumbers(List<Integer> arr, List<Integer> brr){
       for(int i = 0; i < brr.size(); i++){
           for(int j = 0; j < arr.size(); j++){
               if(arr.isEmpty()) break;
               if(arr.get(j).equals(brr.get(i))){
                   arr.remove(j);
                   brr.remove(i);
                   i = 0;
                   break;
               }
           }
           if(arr.isEmpty()) break;
           System.out.println(arr);
           System.out.println(brr);
           System.out.println("\n");
       }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(203 ,204,205, 206, 207, 208, 203, 204, 205, 206));
        ArrayList<Integer> brr = new ArrayList<>(Arrays.asList(203 ,204, 204 ,205, 206, 207,205, 208, 203, 206, 205, 206, 204));
//        System.out.println(missingNumbers(arr,brr));
        missingNumbers(arr, brr);
        System.out.println(brr);
    }
}
