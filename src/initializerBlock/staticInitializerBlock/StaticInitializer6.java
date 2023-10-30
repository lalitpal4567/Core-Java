package initializerBlock.staticInitializerBlock;

public class StaticInitializer6 {
    boolean isMarried;
    String job;
    static String friendName;
    StaticInitializer6(){       // second
        System.out.println("constructor calling...");
        isMarried = false;
    }
    {       // third
        System.out.println("instance block");
        job = "software developer";
    }
    static{     // first
        System.out.println("static block");
        friendName = "sachin";
    }

    public static void main(String[] args) {
        System.out.println("main method");
        StaticInitializer6 obj = new StaticInitializer6();
        System.out.println("isMarried: " + obj.isMarried);
        System.out.println("job: " + obj.job);
        System.out.println("friend name: " + friendName);
    }
}
