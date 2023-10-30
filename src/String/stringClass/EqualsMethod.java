package String.stringClass;

// equals() method checks whether two strings are equal or not.
// It checks the string object not the reference of object
// equals() method returns true or false

// (1) public boolean equals(Object anObject);

public class EqualsMethod {
    public static void main(String[] args) {
        String str = "Birthday";
        String str1 = "Birthday";
        String str2 = "BirthDay";
        String str3 = "";
        String str4 = "";
        String str6 = new String("Birthday");
        String str7 = new String("Birthday");
        String str8 = new String("BIRTHDAY");

        System.out.println("str.equals(str1): " + str.equals(str1));
        System.out.println(str.equals("Happy Birthday"));
        System.out.println("str.equals(str2): " + str.equals(str2));  // case sensitive
        System.out.println("str.equals(str6): " + str.equals(str6));
        System.out.println("str3.equals(str4): " + str3.equals(str4));

        boolean value = str6.equals(str7);
        boolean value1 = str6.equals(str8);
        boolean value2 = str.equals(str6);

        System.out.println("-------------------");
        System.out.println("str6.equals(str7): " + value);
        System.out.println("str6.equals(str8): " + value1);
        System.out.println("str.equals(str6): " + value2);
    }
}
