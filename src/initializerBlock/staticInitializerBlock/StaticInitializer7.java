package initializerBlock.staticInitializerBlock;

public class StaticInitializer7 {
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static{
        System.out.println("static block 1");
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }
    static{
        System.out.println("static block 2");
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(NUM_SECONDS_PER_MINUTE);
        System.out.println(NUM_MINUTES_PER_HOUR);
        System.out.println(NUM_SECONDS_PER_HOUR);
    }
}
