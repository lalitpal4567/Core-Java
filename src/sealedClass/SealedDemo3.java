package sealedClass;

sealed class Shape permits Circle{
    public double area(){
        return 0;
    }
}
non-sealed class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
class SemiCircle extends Circle{
    SemiCircle(int radius){
        super(radius);
    }
    @Override
    public double area(){
        return (Math.PI * radius * radius) / 2;
    }
}
public class SealedDemo3 {
    public static void main(String[] args) {
        Circle obj = new Circle(5);
        SemiCircle obj2 = new SemiCircle(5);

        System.out.println(obj.area());
        System.out.println(obj2.area());
    }
}
