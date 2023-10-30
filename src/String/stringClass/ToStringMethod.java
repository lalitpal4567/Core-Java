package String.stringClass;

// toString() method returns the same string
// String class is overriding the Object class toString() method
// (1) public String toString()

public class ToStringMethod {
    int a = 7;
    String name = "Sachin";

    public static void main(String[] args) {
        String str = "Dream girl";
        String str1 = new String("Dream wife");
        System.out.println("str: " + str.toString());  // String class toString() method
        System.out.println("str1: " + str1.toString());

        System.out.println("-----------------------");
        ToStringMethod obj = new ToStringMethod();
        System.out.println(obj.toString());     // Object class toString() method
        //ToStringMethod@76ed5528
    }
}
