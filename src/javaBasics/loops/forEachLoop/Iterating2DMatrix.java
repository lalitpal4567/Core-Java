package javaBasics.loops.forEachLoop;

public class Iterating2DMatrix {
    public static void iteratingMatrix(int[][] matrix){
//        for(int valueAtIndex : matrix){   // compilation error
//            System.out.println(valueAtIndex);
//        }

        // arrayAtIndex <- {2,4,6}
        for(int[] arrayAtIndex : matrix){
            for(int valueAtIndex : arrayAtIndex){
                System.out.print(valueAtIndex + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{2,4,6}, {6,4,2},{1,3,7}};
        iteratingMatrix(matrix);
    }
}
