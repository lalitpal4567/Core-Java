package String.stringClass;

// isBlank() method checks whether there is a blank string or not
// It returns boolean value.
// (1) public boolean isBlank();

public class IsBlankMethod {
    public static void main(String[] args) {
        String str = "Doing string";
        String str1 = "";
        String str2 = " ";
        String str3 = "" + 30;
        String str4 = new String("O yess");

        System.out.println("str: " + str.isBlank());
        System.out.println("str1: " + str1.isBlank());
        System.out.println("str2: " + str2.isBlank());
        System.out.println("str3: " + str3.isBlank());
        System.out.println("str4: " + str4.isBlank());
        System.out.println("---------------------");

        boolean value = str.isBlank();
        System.out.println("str: " + value);
    }
}
