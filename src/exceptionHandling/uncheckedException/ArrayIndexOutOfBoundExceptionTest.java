package exceptionHandling.uncheckedException;

public class ArrayIndexOutOfBoundExceptionTest {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 7};

        for(int i = 0; i <= arr.length; i++) {
            try{
                System.out.println(arr[i]);     // throws exception at index 5
            }
             catch(ArrayIndexOutOfBoundsException e){
                 System.out.println(e);
             }
            catch(Exception e1) {
                System.out.println("Length of array is: "+arr.length);
            }
        }
    }
}
