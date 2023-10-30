package String.stringClass;

// replace() method returns string
// (1) public String replace(char oldchar, char newchar)
// (2) public String replace(CharSequence target, CharSequence replacement)

public class ReplaceMethod {
    public static void main(String[] args) {
        String str = "Housefull";
        String str1 = "Kanpur  ";
        String str2 = "";
        String str3 = "  " + "ps";
        String str4 = new String("Tit for Tat");

        // (2) public String replace(char oldchar, char newchar);
        System.out.println("str: " + str.replace('f', 'B')); // HouseBull
        System.out.println("str: " + str.replace('F', 'B'));  // case sensitive
        System.out.println("str1: " + str1.replace('K', 'D'));
        // System.out.println("str2: "+str2.replace('', 'i'));
        System.out.println("str3: " + str3.replace(' ', 'o'));
        System.out.println("str4: " + str4.replace('T', 'H')); // will replace all 'T' characters with 'H'

        System.out.println("-------------------------------");
        // or
        System.out.println("Housefull".replace('f', 'B'));

        // we can also create string variable
        String newStr = str.replace('l', 's');
        System.out.println(newStr);  // prints "Housefuss"

        System.out.println("---------------------------------------");


        // (2) public String replace(CharSequence target, CharSequence replacement);
        System.out.println(str.replace("full", "close"));  // Houseclose
        System.out.println(str.replace("full ", "close")); //  no such string is available "full "
        System.out.println(str4.replace("Kan", "Makan"));  // Makanpur


        System.out.println("----------Original String----------");
        System.out.println("str: " + str);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
    }
}
