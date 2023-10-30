package initializerBlock.instanceInitializerBlock;

public class InstanceBlock1 {
    String name;
    String city;

    {
        System.out.println("Initializer Block");  // runs later
        name = "Oswald";
        city = "Pune";
    }
    public void show() {
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
    }

    public static void main(String[] args) {
        System.out.println("Main method");  // runs first
        InstanceBlock1 obj = new InstanceBlock1();
        obj.show();
    }
}
