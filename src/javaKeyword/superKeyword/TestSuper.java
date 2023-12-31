package javaKeyword.superKeyword;

class Point2D{
    double x;
    double y;
    Point2D(){
        x = 0.0;
        y = 0.0;
    }
    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void displayPoint(){
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
class Point3D extends Point2D{
    double z;
    Point3D(){
        super();
        z = 0.0;
    }
    Point3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
    public void displayPoint(){
        super.displayPoint();
        System.out.println("z: " + z);
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Point3D obj = new Point3D(2.0, 3.0, 4.0);
        obj.displayPoint();
    }
}
