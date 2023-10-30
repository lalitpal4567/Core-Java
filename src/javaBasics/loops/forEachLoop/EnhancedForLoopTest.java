package javaBasics.loops.forEachLoop;

public class EnhancedForLoopTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6,10,20,50,60};

        for(int valueAtIndex : arr){
            System.out.print(valueAtIndex + "\t");
        }

        System.out.println();
        for(Integer valueAtIndex : arr){
            System.out.print(valueAtIndex + "\t");
        }

        System.out.println();
        for(Object valueAtIndex : arr){
            System.out.print(valueAtIndex + "\t");
        }
    }
}
