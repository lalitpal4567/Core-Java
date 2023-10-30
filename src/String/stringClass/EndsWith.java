package String.stringClass;

// endsWith() method checks whether a given string ends with specified string or not
// endsWith() method returns true and false
// (1) public boolean endsWith(String suffix)

public class EndsWith {
    public static void main(String[] args) {
        String str = "It is lunch time.";
        String str1 = "break timE";
        String str2 = "";
        String str3 = "  ";
        String str4 = " " + 20;
        String str5 = new String("rest time");

        System.out.println("str: " + str.endsWith("e"));
        System.out.println("str: " + str.endsWith("."));
        System.out.println("str1: " + str1.endsWith("e")); // case sensitive
        System.out.println("str1: " + str1.endsWith("E"));
        System.out.println("str1: " + str1.endsWith("timE"));
        System.out.println("str1: " + str1.endsWith("  timE"));
        System.out.println("str2: " + str2.endsWith(""));
        System.out.println("str3: " + str3.endsWith("    "));
        System.out.println("str4: " + str4.endsWith("20"));
        System.out.println("str5: " + str5.endsWith("st time"));
        // System.out.println(str4.endsWith('e'));  // error It takes only string

    }
}
