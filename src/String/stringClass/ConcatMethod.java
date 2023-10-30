package String.stringClass;

// concat() method adds string to the end of another string
// concat() method returns string
// (1) public String concat(String str)
// (2) public String concat(Object anObject)

public class ConcatMethod {
    public static void main(String[] args) {
        String str = "Web";
        String str1 = "Development";
        String str2 = "Rom";
        String str3 = "an";
        String str4 = "ce";
        String str5 = "" + " " + 20;
        String str6 = new String("No");

        // (1) public String concat(String str)
        System.out.println("str: " + str.concat("site"));
        System.out.println("str: " + str1.concat("Technology"));
        System.out.println("str5: " + str5.concat("22"));
        System.out.println("str6: " + str6.concat("kia"));

        // (2) public String concat(Object anObject)
        System.out.println("str.concat(str1): " + str.concat(str1));
        System.out.println("str2.concat(str3).concat(str4): " + str2.concat(str3).concat(str4));


        System.out.println("--------------------------------");
        String str7 = "Web".concat("Development");
        System.out.println(str7);

        System.out.println("-------Original String--------");
        System.out.println("str: " + str);       //  immutable string
        System.out.println("str1: " + str1);     //  immutable string
        System.out.println("str3: " + str3);     //  immutable string
        System.out.println("str2: " + str2);     //  immutable string
        System.out.println("str4: " + str4);     //  immutable string
        System.out.println("str5: " + str5);     //  immutable string
        System.out.println("str6: " + str6);     //  immutable string
    }
}
