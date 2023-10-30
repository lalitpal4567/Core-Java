package javaBasics.array.oneD;

public class ArrayDeclarationInitialization2
{
    public static void main(String[] args) {

//        int arr[] = new int[] {40,80,25,45,63,80,50};   // Declaration + initialization
//        int[] arr = new int[] {40,80,25,45,63,80,50};   // Declaration + initialization

        /////////////////////////////////////////////////////////////////////

//        int arr[] = new int[5]{2030,60,70,80};        // compilation error
//        int[5] arr = new int[5]{20,30,60,70,80};      // compilation error
//        int[5] arr = new int[]{23,50,90,80,40};       // compilation error

        /////////////////////////////////////////////////////////////////////

//        int[] arr = new int[5];
//        arr = {20,64,23,12,11};     // compilation error


//        int[] arr = new int[];
//        arr = {22,11,66,33,11};     //  compilation error

        /////////////////////////////////////////////////////////////////////

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;


//        int[5] arr = new int[];     // compilation error
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;

        /////////////////////////////////////////////////////////////////////

//        int arr[];            // Declaration
//        arr = new int[5];     // size initialization
//        arr[0] = 1;
//        arr[2] = 2;
//        arr[3] = 3;


//        int[] arr;
//        arr = new int[]{10,50,45,65,36,63};   // Initialization

        ////////////////////////////////////////////////////////////////////

//        int[] arr;
//        arr = new int[5];
//        arr = {2,3,6,8,0};    // compilation error, Array initializer is not allowed here
    }
}

