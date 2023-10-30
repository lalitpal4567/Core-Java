package initializerBlock.staticInitializerBlock;

public class StaticInitializer {
    static String name;
    static int age;

    static{
        System.out.println("hi");
        name = "lalit";
        age = 23;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(name);
        System.out.println(age);
    }
}
