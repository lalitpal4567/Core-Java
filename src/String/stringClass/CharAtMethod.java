package String.stringClass;

// charAt() method is used to get a particular character at a specified index
// charAt() method returns character at a given index
// (1) public char charAt(int index)

public class CharAtMethod {
    public static void main(String[] args) {
        String str = "It is raining today.";
        String str1 = "  ";
        String str2 = "";
        String str3 = new String("yumee");

        System.out.println("Length of str is: " + str.length());  // 20
        System.out.println("str: " + str.charAt(7));  // a
        System.out.println("str: " + str.charAt(19)); // .
//         System.out.println("str: "+str.charAt(20));   // StringIndexOutOfBoundsException
//         System.out.println("str: "+str.charAt(-1));      // StringIndexOutOfBoundsException
        System.out.println("str1: " + str1.charAt(1));    // space
//        System.out.println("str2: "+str2.charAt(0));   // StringIndexOutOfBoundsException

        // storing char variable
        char ch = str3.charAt(0);
        System.out.println("str2: " + ch);
    }
}
