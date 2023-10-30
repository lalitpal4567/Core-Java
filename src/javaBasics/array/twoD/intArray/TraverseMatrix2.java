package javaBasics.array.twoD.intArray;

public class TraverseMatrix2 {
    public static void traverse(int[][] arr){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] position = new int[3][];
        position[0] = new int[]{2, 4, 6, 8, 10};
        position[1] = new int[]{1, 3, 5};
        position[2] = new int[]{2, 5, 7, 11, 13, 17, 19};

        int[][] position2 = new int[3][5];
        position2[0] = new int[]{2, 4, 6, 8, 10};
        position2[1] = new int[]{1, 3, 5};
        position2[2] = new int[]{2, 5, 7, 11, 13, 17, 19};

        traverse(position);
        traverse(position2);
    }
}

