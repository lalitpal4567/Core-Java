package javaBasics.loops.forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratingCollectionObject {
    public static void displayRollNo(List<Integer> rollNo){
        System.out.println("Display roll no.");
        for(Integer value : rollNo){
            System.out.print(value + "\t");
        }

        for(Object data : rollNo){
            System.out.print("\n" + data + "\t");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,6,7);
        ArrayList<Integer> rollNo = new ArrayList<>(list);

        displayRollNo(rollNo);
    }
}
