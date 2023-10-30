package passByVauleReference;

public class PassByReference3 {
    public static void swap(Integer value1, Integer value2){
        Integer temp = value1;
        value1 = value2;
        value2 = temp;
    }

    public static void main(String[] args) {
        Integer value1 = 10;
        Integer value2 = 20;

        System.out.println("before swapping");
        System.out.println("value1: " + value1 + "\nvalue2: " + value2);

        swap(value1, value2);
        System.out.println("after swapping");
        System.out.println("value1: " + value1 + "\nvalue2: " + value2);
    }
}