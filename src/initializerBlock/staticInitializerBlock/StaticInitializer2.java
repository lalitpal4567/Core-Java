package initializerBlock.staticInitializerBlock;

public class StaticInitializer2 {
    static char gender;
    static String dob;

    StaticInitializer2(){
        System.out.println("calling constructor...");
        gender = 'm';
    }
    static{
        System.out.println("static block");
        dob = "14/11/1999";
    }

    public static void main(String[] args) {
        new StaticInitializer2();
        System.out.println("main method");
        System.out.println("gender: " + gender + "dob: " + dob);
    }
}
