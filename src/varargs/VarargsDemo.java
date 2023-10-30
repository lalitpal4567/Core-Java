package varargs;

// Regardless of which you use to call the method, the method will receive
//
public class VarargsDemo {
    public static void alwaysAnArray(int... data){
        int[] newArray = data;
        for(int value : newArray){
            System.out.print(value + "  ");
        }
        System.out.println("\nlength: " + newArray.length);
    }

    public static void main(String[] args) {
        alwaysAnArray(5, 4, 3, 2);
    }
}
