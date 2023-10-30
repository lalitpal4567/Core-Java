package String.stringClass;

// compareTo() method checks whether two strings are equal or not. It is similar to equals() method
// compareTo() method returns 0 if strings are equal
// It is case sensitive.
// (1) public int compareTo(String anotherString)
// (2) public int compareTo(Object anobject)

public class CompareToMethod {
    public static void main(String[] args) {
        String str = "Software Engineer";
        String str1 = "Software Engineer";
        String str2 = "Software engineer";
        String str3 = "";
        String str4 = "  ";
        String str5 = " " + 400;

        String str6 = new String("Software Engineer");
        String str7 = new String("Software Engineer");


        // (1) pulbic int compareTo(String anotherString)
        System.out.println(str.compareTo("Software Engineer")); // 0
        System.out.println(str3.compareTo("")); // 0
        System.out.println(str4.compareTo("  "));   // 0
        System.out.println(str5.compareTo(" " + 400));    // 0


        System.out.println("-------------------------------");
        System.out.println(str.compareTo("Software engineer")); // -32 case sensitive
        System.out.println(str2.compareTo("software Engineer"));
        System.out.println(str5.compareTo("" + 400));

        System.out.println("--------Using string objects--------");

        // (2) public int compareTo(Object anobject)
        System.out.println(str.compareTo(str1)); // 0
        System.out.println(str.compareTo(str2)); // ....
        System.out.println(str.compareTo(str6));  // 0
        System.out.println(str6.compareTo(str7)); // 0

    }
}
