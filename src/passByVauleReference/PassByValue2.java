package passByVauleReference;

public class PassByValue2 {
    public static void swap(int value1, int value2){
        int temp = value1;
        value1 = value2;
        value2 = temp;
    }

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;

        System.out.println("before swapping");
        System.out.println("value1: " + value1 + "\nvalue2: " + value2);

        swap(value1, value2);
        System.out.println("\nafter swapping");
        System.out.println("value1: " + value1 + "\nvalue2: " + value2);
    }
}
