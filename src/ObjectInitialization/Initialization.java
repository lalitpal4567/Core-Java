package ObjectInitialization;

public class Initialization {
    public void area() {
        System.out.println(length * breadth);
    }
    int length;
    int breadth;

    Initialization(int length, int width) {
        this.length = length;
        breadth = width;
    }

    public static void main(String[] args) {
        Initialization obj = new Initialization(4,6);
        obj.area();
    }
}

