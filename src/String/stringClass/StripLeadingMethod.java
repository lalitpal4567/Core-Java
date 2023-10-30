package String.stringClass;

// stripLeading() method removes spaces from the front of the given string
// stripLeading() method returns string with all white space remove from beginning.
// (1) public String stripLeading()

public class StripLeadingMethod {
    public static void main(String[] args) {
        String str = "    how     have you    been today?     ";
        String str1 = "         Today i will finish all string methods";
        String str2 = "";
        String str3 = " " + "  " + 43;
        String str4 = new String("  Hi there!");

        System.out.println("str: " + str.stripLeading());
        System.out.println("str1: " + str1.stripLeading());
        System.out.println("str2: " + str2.stripLeading());
        System.out.println("str3: " + str3.stripLeading());
        System.out.println("str4: " + str4.stripLeading());

        System.out.println("------Original Strings--------");
        System.out.println("str: " + str);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
    }
}
