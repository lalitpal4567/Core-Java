package nestedClass.staticInnerClass;

public class Park {
    static class Ride{
        private int price = 6;
    }
    public static void main(String[] args) {
//        Park.Ride obj2 = new Park.Ride();   // valid
        Ride obj = new Ride();
        System.out.println(obj.price);
    }
}
