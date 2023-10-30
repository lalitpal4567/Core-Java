package String.stringClass;

// valueOf() method converts primitive type data into String
// valueOf() method returns String
// It is static method. It can be accessed only by class name (String)
// (1) public static String valueOf(Object obj)
// (2) public static String valuOf(int i)
// (3) public static String valuOf(long l)
// (4) public static String valuOf(float f)
// (5) public static String valuOf(double d)
// (6) public static String valuOf(char c)
// (7) public static String valuOf(boolean b)
// (8) public static String valuOf(char[] data)
// (9) public static String valueOf(char[] data, int offset, int count)

public class ValueOfMethod {
    public static void main(String[] args) {
        String s1 = "b4u";
        String s2 = null;
        int a = 5001;
        long b = 456978L;
        float c = 40.5F;
        double d = 30.907;
        char e = 'Y';
        boolean f = true;
        char[] ch = {'w', 'e', 'l', 'l'};

        String s = String.valueOf(s1);
        String ss = String.valueOf(s2);
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String str3 = String.valueOf(c);
        String str4 = String.valueOf(d);
        String str5 = String.valueOf(e);
        String str6 = String.valueOf(f);
        String str7 = String.valueOf(ch);

        System.out.println("s: " + s.toString());
        System.out.println("str1: " + str1.toString());
        System.out.println("str2: " + str2.toString());
        System.out.println("str3: " + str3.toString());
        System.out.println("str4: " + str4.toString());
        System.out.println("str5: " + str5.toString());
        System.out.println("str6: " + str6.toString());
        System.out.println("str7: " + str7.toString());

    }
}
