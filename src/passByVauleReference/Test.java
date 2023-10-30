package passByVauleReference;

class Balloon {
    private String color;
    public Balloon() {}
    public Balloon(String c) {
        this.color = c;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
public class Test {

    // Generic swap method
    public static void swap(Balloon o1, Balloon o2){
//        Object temp = o1;
//        o1 = o2;
//        o2 = temp;
        String str1 = o1.getColor();
        o1.setColor(o2.getColor());
        o2.setColor(str1);

//        System.out.println(o1.getColor());
//        System.out.println(o2.getColor());
    }
    private static void changeValue(Balloon balloon) { // balloon = 100
        balloon.setColor("Red"); // balloon = 100
        balloon = new Balloon("Green"); // balloon = 200
        balloon.setColor("Blue"); // balloon = 200
    }

    public static void main(String[] args) {
        Balloon red = new Balloon("Red"); // memory reference = 50
        Balloon blue = new Balloon("Blue"); // memory reference = 100

//        System.out.println(red.getColor());
//        System.out.println(blue.getColor());
        swap(red, blue);
        System.out.println("After the swap method executes:");
        System.out.println("`red` color value = " + red.getColor());
        System.out.println("`blue` color value = " + blue.getColor());

        changeValue(blue);
        System.out.println("After the changeValue method executes:");
        System.out.println("`blue` color value = " + blue.getColor());
    }
}
