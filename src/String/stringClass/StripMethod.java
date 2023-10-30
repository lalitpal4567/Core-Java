package String.stringClass;

// strip() method returns string with white spaces removed from beginning and end
// It is similar to trim() method
// (1) public String strip()

public class StripMethod {
    public static void main(String[] args) {
        String str = "   how   have you    been?      ";
        String str1 = "see you later";
        String str2 = "";
        String str3 = "  ";

        System.out.println("str: " + str.strip());
        System.out.println("str1: " + str1.strip());
        System.out.println("str2: " + str2.strip()); // returns empty string
        System.out.println("str3: " + str3.strip()); // returns empty string

        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());
    }
}
