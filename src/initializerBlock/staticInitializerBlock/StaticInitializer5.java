package initializerBlock.staticInitializerBlock;

public class StaticInitializer5 {
    static int year;
    static String favFood;
    static char agreeOrNot;
    boolean isHappy;

    static {
        System.out.println("static block");
        year = 2005;
        {
            System.out.println("instance block 1");
            favFood = "pizza";
        }
        {
            System.out.println("instance block 2");
//            isHappy = true;     // compilation error
            agreeOrNot = 'y';
        }
    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(year);
        System.out.println(favFood);
        System.out.println(agreeOrNot);
        System.out.println(new StaticInitializer5().isHappy);   // false
    }
}
