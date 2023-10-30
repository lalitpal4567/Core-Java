package initializerBlock.staticInitializerBlock;

public class StaticInitializer4 {
    static String address;
    static int pinCode;

//    static{
//        address = "delhi";
//        static{         // compilation error
//            pinCode = 201309;
//        }
//    }

    static{
        System.out.println("static block");
        address = "noida";
        {
            System.out.println("instance block");
            pinCode = 201309;
        }
    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(address);
        System.out.println(pinCode);
    }
}
