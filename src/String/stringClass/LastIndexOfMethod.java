package String.stringClass;

// lastIndexOf() method returns last occuring of string or character specified by the index
// (1) public int lastIndexOf(int ch)
// (2) public int lastIndexOf(int ch, int fromIndex)
// (3) public int lastIndexOf(String str)
// (4) public int lastIndexOf(String str, int fromIndex)

public class LastIndexOfMethod {
    public static void main(String[] args) {
        String str = "Mahabharat Ramayan";
        String str1 = "hi i am hi a teacher hi";
        String str2 = new String("hello who hello is hello speaking hello hi");


        System.out.println("Length of str: " + str.length());  // 18
        // (1) public int lastIndexOf(int ch)
        System.out.println("str: " + str.lastIndexOf('a'));  // 16
        System.out.println("str: " + str.lastIndexOf('m'));
        System.out.println("str: " + str.lastIndexOf('k'));  // returns -1
        // System.out.println(str.lastIndexOf(7));  // doubt

        // (2) public int lastIndexOf(int ch, int fromIndex)
        System.out.println("str: " + str.lastIndexOf('a', 0));   // -1
        System.out.println("str: " + str.lastIndexOf('a', 3));   // 3
        System.out.println("str: " + str.lastIndexOf('a', 4));   // 3
        System.out.println("str: " + str.lastIndexOf('a', 9));   // 8
        System.out.println("str: " + str.lastIndexOf('a', 15));  // 14

        // (3) public int lastIndexOf(String str)
        System.out.println("str1: " + str1.lastIndexOf("hi"));
        System.out.println("str2: " + str2.lastIndexOf("hello"));

        // (4) public int lastIndexOf(String str, int fromIndex)
        System.out.println("str1: " + str1.lastIndexOf("hi", 3));
        System.out.println("str1: " + str1.lastIndexOf("hi", 16));
        System.out.println("str2: " + str2.lastIndexOf("hello", 7));

    }
}
