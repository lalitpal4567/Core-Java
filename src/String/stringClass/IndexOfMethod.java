package String.stringClass;

// indexOf() method returns index. In case of wrong string and char it returns -1
// (1) public int indexOf(String str);
// (2) public int indexOf(int ch);
// (3) public int indexOf(String str, int fromIndex);
// (4) public int indexOf(int ch, int fromIndex);
// (5) public int indexOf(Object anobject)
// (6) public int indexOf(Object anobject, int fromIndex)

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "programMing is a soft skiLl";
        String str1 = "  " + 9000;
        String str2 = "soft";
        String str3 = "ski";
        String str4 = "o";

        System.out.println("Length of str: " + str.length());
        // (1) public int indexOf(String str);
        // (2) public int indexOf(int ch);
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf('G'));  // case sensitive and returns -1
        System.out.println(str.indexOf(' '));
        System.out.println(str1.indexOf(0));  // returns -1
        System.out.println(str.indexOf("soft"));
        System.out.println("str: " + str.indexOf("ing is"));
        System.out.println("str4: " + str4.indexOf("o"));

        System.out.println("-----------------------");
        // (4) public int indexOf(int ch, int fromIndex);
        System.out.println(str.indexOf('a', 5));
        System.out.println(str.indexOf('a', 6));
        System.out.println(str.indexOf('f', 20)); // returns -1

        // (3) int indexOf(String str, int fromIndex);
        System.out.println(str.indexOf("soft", 14));
        System.out.println(str.indexOf("soft", 18));  // returns -1

        System.out.println("--------Using string object----------");
        // (5) int indexOf(Object anobject)
        System.out.println(str.indexOf(str2));
        System.out.println(str.indexOf(str3));

        // (6) int indexOf(Object anobject , int fromIndex)
        System.out.println(str.indexOf(str4, 2));
        System.out.println(str.indexOf(str4, 3));

    }
}
