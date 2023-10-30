package String.stringClass;

// compareToIgnoreCase() method checks whether two strings are equal or not lexicographically, ignoring case differences
// compareToIgnoreCase() method returns 0 if strings are equal
// (1) public int compareToIgnoreCase(String str)
// (2) public int compareToIgnoreCase(Object anobject)

public class CompareToIgnoreCaseMethod {
    public static void main(String[] args) {
        String str = "Greater Noida";
        String str1 = "Greater Noida";
        String str2 = "GreaTER nOIda";
        String str3 = " Greater noida";
        String str4 = new String("Greater NOIDA");

        // (1) int compareToIgnoreCase(String str)
        System.out.println("str: " + str.compareToIgnoreCase("Greater Noida"));   // 0
        System.out.println("str: " + str.compareToIgnoreCase("Greater noida"));   // 0
        System.out.println("str2: " + str2.compareToIgnoreCase("greater noida")); // 0
        System.out.println("str3: " + str3.compareToIgnoreCase("graater noida")); // -71
        System.out.println("str3: " + str4.compareToIgnoreCase("Greater NOIDA")); // 0
        System.out.println("str3: " + str4.compareToIgnoreCase(" Greater NOIDA")); // 71

        System.out.println("--------Using string object---------");

        // (2) public int compareToIgnoreCase(Object anobject)
        System.out.println("str1 comp str2: " + str1.compareToIgnoreCase(str2));  // 0
        System.out.println("str2 comp str3: " + str2.compareToIgnoreCase(str4));  // 0
    }
}
