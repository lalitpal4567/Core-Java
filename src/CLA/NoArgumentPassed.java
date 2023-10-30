package CLA;

// When no input is given from console
public class NoArgumentPassed {
    public static void main(String[] str) {
//        System.out.println(str[0]);     // ArrayIndexOutOfBoundsException

        str[0] = "nice";    // compilation error
        str[1] = "2";       // compilation error
        str[2] = "meet";    // compilation error
        str[3] = "you";     // compilation error

        for(String data : str){
            System.out.println(data);
        }
    }
}
