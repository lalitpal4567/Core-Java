package String.stringClass;

// toUpperCase() method converts a string to uppercase string
// toUpperCase() returns string
// (1) public String toUpperCase()
// (2) public String toUpperCase(Locale locale)

public class ToUpperCase {
    public static void main(String[] args) {
        String str = "nature is beautiful";
        String str1 = "i like Greenary";
        String str2 = "EARTH IS OUR MOTHER";
        String str3 = "     Life        is   HELL       ";
        String str4 = "";
        String str5 = "  " + 50;
        String str6 = new String("toUpperCase methoD");

        System.out.println("str: " + str.toUpperCase());
        System.out.println("str1: " + str1.toUpperCase());
        System.out.println("str2: " + str2.toUpperCase());
        System.out.println("str3: " + str3.toUpperCase());
        System.out.println("str4: " + str4.toUpperCase());
        System.out.println("str5: " + str5.toUpperCase());
        System.out.println("str6: " + str6.toUpperCase());
        System.out.println("-----------------------");

        // we can also create string variable and store it
        String newStr = str.toUpperCase();
        System.out.println(newStr);

        System.out.println("-------------------------");

        System.out.println("--------Original strings--------");
        System.out.println("Original string str:  " + str);
        System.out.println("Original string str1: " + str1);
        System.out.println("Original string str2: " + str2);
        System.out.println("Original string str3: " + str3);
        System.out.println("Original string str4: " + str4);
        System.out.println("Original string str5: " + str5);
        System.out.println("Original string str6: " + str6);
    }
}
