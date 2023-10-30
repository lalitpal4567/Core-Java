package initializerBlock.staticInitializerBlock;

public class StaticInitializer8 {
    static int one;
    static final int two;
    static final int three = 3;
//    static final int four;      // compilation error

    static{
        one = 1;
        two = 2;
//        three = 3;      // compilation error
//        two = 4;        // compilation error
    }
}
