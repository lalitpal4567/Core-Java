package String.stringClass;

public class ContainsMethod {
    public static void main(String[] args) {
        String str = "Today is Sri KRISHNA's birthday";
        String str1 = "   HAPPY  birthday      sri krishna       ";
        String str2 = "";
        String str3 = " ";
        String str4 = " " + 101;

        System.out.println(str.contains("KRISHNA"));
        System.out.println(str.contains("KRIShNA"));  // case sensitive
        System.out.println(str1.contains("   HAPPY birthday      sri krishna"));
        System.out.println(str2.contains(""));
        System.out.println((str3.contains("   ")));
        System.out.println(str4.contains(" "));
        System.out.println(str1.contains("d"));
        // System.out.println(str1.contains('d'));  // error

        System.out.println("------------------");
        boolean value = str.contains("birthday");
        System.out.println(value);
    }
}
