package javaBasics.array.twoD.intArray;

public class TraverseMatrix3 {
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
//        int[][] position = new int[3][];
//        position[0][0] = 2;
//        position[0][1] = 4;
//        position[0][2] = 6;
//        position[0][3] = 8;
//        position[0][4] = 10;
//        position[1][0] = 1;
//        position[1][1] = 3;
//        position[1][2] = 5;
//        position[2][0] = 2;
//        position[2][1] = 5;
//        position[2][2] = 7;
//        position[2][3] = 11;
//        position[2][4] = 13;
//        position[2][5] = 17;
//        position[2][6] = 19;

        int[][] position2 = new int[3][5];
        position2[0][0] = 2;
        position2[0][1] = 4;
        position2[0][2] = 6;
        position2[0][3] = 8;
        position2[0][4] = 10;

        position2[1][0] = 1;
        position2[1][1] = 3;
        position2[1][2] = 5;

        position2[2][0] = 2;
        position2[2][1] = 5;
        position2[2][2] = 7;
        position2[2][3] = 11;
        position2[2][4] = 13;
        position2[2][5] = 17;
        position2[2][6] = 19;

//        traverse(position);
        traverse(position2);
    }
}


