package passByVauleReference;

public class PassByValue {
    public static void modifier(int data){
        data = 100;
    }

    public static void main(String[] args) {
        int data = 200;
        modifier(data);
        System.out.println(data);   // 200
    }
}
