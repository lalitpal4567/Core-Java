package String.stringClass;

// repeat() method repeats the given string
// repeat() method returns string
// (1) public String repeat(int count)

public class RepeatMethod {
    public static void main(String[] args) {
        String str = "ha ";
        String str1 = "shit! ";
        String str2 = "" + 9;
        String str3 = new String("z");


        System.out.println(str.repeat(5));
        System.out.println(str1.repeat(1));
        System.out.println(str2.repeat(0));
        System.out.println(str3.repeat(10));
        // System.out.println(str3.repeat(-1));   // IllegalArgumentException

        System.out.println("---------Original String----------");
        System.out.println("str: " + str);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

    }
}
