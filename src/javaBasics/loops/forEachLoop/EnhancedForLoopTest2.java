package javaBasics.loops.forEachLoop;

public class EnhancedForLoopTest2 {
    public static void showObject(Integer[] array){
        for(int data : array){
            System.out.print(data + "\t");
        }

        System.out.println();
        for(Integer data : array){
            System.out.print(data + "\t");
        }

//        for(Long data : array){       // compilation error
//            System.out.println(data + "\t");
//        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Integer[] array = {5, 10, 15, 20, 25, 30};

        showObject(array);
    }
}
