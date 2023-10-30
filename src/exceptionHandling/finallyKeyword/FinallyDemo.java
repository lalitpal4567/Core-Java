package exceptionHandling.finallyKeyword;


// Finally will always run whether there is exception or not

public class FinallyDemo {
    public static void main(String[] args) {
        int arr[] = new int[]{7,5,3,2,9};

        try {
            for(int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch(Exception e) {
            System.out.println("index is out of bound.");
        }
        finally {
            System.out.println("Finally will always run whether there is exception or not.");
        }
    }
}
