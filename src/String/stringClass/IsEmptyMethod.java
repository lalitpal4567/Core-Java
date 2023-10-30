package String.stringClass;

// isEmpty() method checks whether a string is empty or not
// It returns boolean value true or false
// (1) public boolean isEmpty();

public class IsEmptyMethod {
    public static void main(String[] args) {
        String str = "Java script";
        String str1 = "";
        String str2 = " ";
        String str3 = "" + 20;
        // String str4 = 50;  // error
        String str4 = new String("well done");

        System.out.println("str: " + str.isEmpty());
        System.out.println("str1: " + str1.isEmpty());
        System.out.println("str2: " + str2.isEmpty());
        System.out.println("str3: " + str3.isEmpty());
        System.out.println("str4: " + str4.isEmpty());

        boolean value = str.isEmpty();
        System.out.println("str: " + value);

        System.out.println("".isEmpty());  // or
    }
}
