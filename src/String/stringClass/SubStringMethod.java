package String.stringClass;

// substring() method takes a piece out of a given string according to specified index
// substring() method returns string
// (1) public String substring(int beginIndex)
// (2) public String substring(int beginIndex, int endIndex)

public class SubStringMethod {
    public static void main(String[] args) {
        String str = "skills are    the key to success.";
        String str1 = "      ";
        String str2 = "" + 6000;
        String str3 = new String("IndiaIsBest");

        // (1) substring(int beginIndex)
        System.out.println("Length of str: " + str.length());  // 33
        System.out.println("str: " + str.substring(4));
        // System.out.println("str: "+str.substring(-2));      // StringIndexOutOfBoundsException
        // System.out.println("str: "+str.substring(40)); // StringIndexOutOfBoundsException
        System.out.println("str1: " + str1.substring(3));
        System.out.println("str2: " + str2.substring(2));
        System.out.println("str3: " + str3.substring(7));

        System.out.println("----------------------------");

        // (2) substring(int beginIndex, int endIndex)
        System.out.println("str: " + str.substring(5, 15));
        System.out.println("str: " + str.substring(5, 5));  // will not print anything
        System.out.println("str: " + str.substring(3, 32));  // prints one element less
        System.out.println("str1: " + str1.substring(2, 5));
        System.out.println("str2: " + str2.substring(1, 4));
        System.out.println("str: " + str.substring(5,4));   // StringIndexOutOfBoundsException

        System.out.println("Length of str3 is: " + str3.length());  // 11
        System.out.println("str3: " + str3.substring(0, 11));
        System.out.println("str3: " + str3.substring(0, 12));  // StringIndexOutOfBoundsException
    }
}
