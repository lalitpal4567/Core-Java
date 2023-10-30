package staticKeyword;

public class Circle2 {
    static int circleCount = 0;
    double x;
    double y;
    double r;

    Circle2(){
        this(0.0, 0.0, 0.1);
    }
    Circle2(double r){
        this(0.0, 0.0, r);
        circleCount++;
    }
    Circle2(Circle2 c){
        this(c.x, c.y, c.r);
        circleCount++;
    }
    Circle2(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        circleCount++;
    }
    public double circumference(){
        return (2 * Math.PI * r);
    }
    public double area(){
        return Math.PI * Math.pow(r, 2);
    }

    public Circle2 bigger(Circle2 c){
        if(c.r > r) return c;
        else return this;
    }
    public static Circle2 bigger(Circle2 a, Circle2 b){
        if(a.r > b.r) return a;
        else return b;
    }

    public static void main(String[] args) {
        Circle2 c1 = new Circle2(2.0);
        Circle2 c2 = new Circle2(5.0);
        Circle2 c3 = c1.bigger(c2);

        Circle2 c4 = bigger(c1, c2);
        System.out.println(c3.r);
        System.out.println(c4.r);

    }
}

