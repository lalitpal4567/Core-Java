package CLA;

public class SumOfTwoNum {
    public static void main(String[] args) {
//        int result = args[0] + args[1];  // compilation error

        // args[0] -> 2
        // args[1] -> 4
        int output = Integer.parseInt (args[0]) + Integer.parseInt(args[1]);
        System.out.println(output);
    }
}
