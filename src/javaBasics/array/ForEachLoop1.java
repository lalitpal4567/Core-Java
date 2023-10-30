package javaBasics.array;

public class ForEachLoop1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{3,5,2},{2,6,4}};

//        for(int i : arr){       // compilation error
//            System.out.println(i);
//        }
        for(int[] i : arr){
            System.out.println(i);
        }
    }
}
