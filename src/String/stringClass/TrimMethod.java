package String.stringClass;

// trim() method removes spaces from starting and end of the string
// trim() method returns String
// (1) public String trim()

public class TrimMethod {
    public static void main(String[] args) {
        String str = "Well done";
        String str1 = "  I am proud of you";
        String str2 = "Keep it up    ";
        String str3 = "     Never         give    up           ";
        String str4 = "  Today's temperature is " + 10;
        String str5 = "";
        String str6 = " ";
        String str7 = new String("  You are    best  ");

        System.out.println("str: " + str.trim());
        System.out.println("str1: " + str1.trim());
        System.out.println("str2: " + str2.trim());
        System.out.println("str3: " + str3.trim());
        System.out.println("str4: " + str4.trim());
        System.out.println("str5: " + str5.trim());
        System.out.println("str6: " + str6.trim());
        System.out.println("str7: " + str7.trim());
        System.out.println("-------------------------");

        // we can also store it in a string variable
        String newStr = str.trim();
        System.out.println(newStr);


        System.out.println("-------Original strings------");
        System.out.println("Original String str:  " + str);
        System.out.println("Original String str1: " + str1);
        System.out.println("Original String str2: " + str2);
        System.out.println("Original String str3: " + str3);
        System.out.println("Original String str4: " + str4);
        System.out.println("Original String str5: " + str5);
        System.out.println("Original String str6: " + str6);
        System.out.println("Original String str7: " + str7);
    }
}
