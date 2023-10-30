package CLA;

public class AreaOfRectangle {
    int length;
    int breadth;

    public int area(){
        return length * breadth;
    }

    public static void main(String[] args) {

        // args[0] -> 10
        // args[1] -> 20
        AreaOfRectangle obj = new AreaOfRectangle();
        obj.length = Integer.parseInt(args[0]);
        obj.breadth = Integer.parseInt(args[1]);

        System.out.println("Area of rectangle is: " + obj.area());
    }
}
