package LambdaAndFunctionInterface;

interface Climb{
    boolean isTooHigh(int height, int limit);
}
public class Exercise2 {
    private static void check(Climb climb, int height){
        if(climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
    public static void main(String[] args) {
//        check(h, m) -> h.append(m).isEmpty(),5);    // compilation error
    }
}
