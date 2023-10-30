package generics.genericMethod;

public class GenericMethod {
    public static <T> void printArray(T[] array){
        for(T value : array){
            System.out.printf("%s" ,value);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 4, 3, 2, 1};
        printArray(arr);
    }
}
