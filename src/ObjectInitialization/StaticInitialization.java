package ObjectInitialization;

public class StaticInitialization {
    int distance = distInit();

    private static int distInit() {
        return 5;
    }

    public static void main(String[] args) {
        StaticInitialization obj = new StaticInitialization();
        System.out.println(obj.distance);
    }
}

