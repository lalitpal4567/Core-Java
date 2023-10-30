package initializerBlock.staticInitializerBlock;

public class StaticInitializer3 {
    static boolean isHealthy;
    static int weight;
    String favColor;

    StaticInitializer3(){   // third calling
        System.out.println("constructor calling...");
        isHealthy = true;
        favColor = "sky_blue";
    }
    static{     // will be called first before main method
        System.out.println("static block 1");
        weight = 65;
//        favColor = "blue";  // compilation error
    }
    static{     // second calling before main method
        System.out.println("static block 2");
        weight = 70;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        StaticInitializer3 obj = new StaticInitializer3();
        System.out.println(isHealthy);
        System.out.println(weight);
        System.out.println(obj.favColor);
    }
}
