package String.stringClass;

// equalsIgnoreCase() method checks whether two strings are equal or not no matter whether a string is uppercase or lowercase

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str = "i am learning CORE java";
        String str1 = "advancED javA";
        String str2 = "";
        String str3 = "    ";
        String str4 = " " + 30;
        String str5 = new String("i am learning CORE java");

        System.out.println(str.equalsIgnoreCase("i am learning core java"));
        System.out.println(str.equalsIgnoreCase("I am learning core JAVA"));
        System.out.println(str.equalsIgnoreCase(str5));
        System.out.println(str.equalsIgnoreCase("learning core java"));
        System.out.println(str1.equalsIgnoreCase("ADVANCED JAVA"));
        System.out.println(str2.equalsIgnoreCase(""));
        System.out.println(str3.equalsIgnoreCase("  "));
        System.out.println(str4.equalsIgnoreCase(" " + 30));
    }
}
