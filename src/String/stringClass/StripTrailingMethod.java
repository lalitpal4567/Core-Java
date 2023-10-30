package String.stringClass;

// stripTrailing() method removes the spaces from the end of the given string
// stripTrailing() method returns string with white space removed from end
// (1) public String stripTrailing()

public class StripTrailingMethod {
    public static void main(String[] args) {
        String str = "   Java programming     ";
        String str1 = "Honesty is     the best policy    ";
        String str2 = "";
        String str3 = 99 + "  " + "   ";
        String str4 = new String("Shit!    ");


        System.out.println("Length of str: " + str.length());  // 24
        // System.out.println("str: "+str.stripTrailing());
        System.out.println(str.stripTrailing().length());  // 19

        System.out.println("str1: " + str1.stripTrailing());
        System.out.println("str2: " + str2.stripTrailing());
        System.out.println("str3: " + str3.stripTrailing());
        System.out.println("str4: " + str4.stripTrailing());


        System.out.println("------Original Strings-------");
        System.out.println("str: " + str);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
    }
}
