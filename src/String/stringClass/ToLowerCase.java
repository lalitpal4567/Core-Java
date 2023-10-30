package String.stringClass;

// toLowerCase() method converts a string to lowercase string
// toLowerCase() method returns string in Lower case
// (1) public String toLowerCase()
// (2) public String toLowerCase(Locale locale)

public class ToLowerCase {
    public static void main(String[] args) {
        String str = "nature is beautiful";
        String str1 = "i like Greenary";
        String str2 = "EARTH IS OUR MOTHER";
        String str3 = "     Life        is   HELL       ";
        String str4 = "";
        String str5 = "  " + 50;
        String str6 = new String("tolowerCase MethoD");

        System.out.println("str: " + str.toLowerCase());
        System.out.println("str1: " + str1.toLowerCase());
        System.out.println("str2: " + str2.toLowerCase());
        System.out.println("str3: " + str3.toLowerCase());
        System.out.println("str4: " + str4.toLowerCase());
        System.out.println("str5: " + str5.toLowerCase());
        System.out.println("str6: " + str6.toLowerCase());
        System.out.println("-----------------------");

        String newStr = str.toLowerCase();
        System.out.println(newStr);
        System.out.println("-------------------------");

        System.out.println("------Original Strings-------");
        System.out.println("Original string str:  " + str);
        System.out.println("Original string str1: " + str1);
        System.out.println("Original string str2: " + str2);
        System.out.println("Original string str3: " + str3);
        System.out.println("Original string str4: " + str4);
        System.out.println("Original string str5: " + str5);
        System.out.println("Original string str6: " + str6);

    }
}
