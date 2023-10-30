package String.stringClass;

// length() method counts the length of the given string
// length() method returns integer
// (1) public int length();

public class LengthMethod {
    public static void main(String[] args) {
        String str = "Full Stack Development";
        String str1 = "";
        String str2 = "  ";
        String str3 = " " + 100;
        String str4 = new String(".");

        System.out.println("str: " + str.length());
        System.out.println("str1: " + str1.length());
        System.out.println("str2: " + str2.length());
        System.out.println("str3: " + str3.length());
        System.out.println("str4: " + str4.length());
        System.out.println("---------------------");

        int len = str.length();
        System.out.println("str: " + len);
        System.out.println("-----------------------");

        System.out.println(str + " " + "Full Stack Development".length());
        System.out.println("Back end development".length());
    }
}
