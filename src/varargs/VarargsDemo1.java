package varargs;

public class VarargsDemo1 {
    public static void DemoMethod(int ...v){
        for(int value : v){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        DemoMethod(arr);
        DemoMethod(9, 5, 4);
        DemoMethod(7);
        DemoMethod();
    }
}
