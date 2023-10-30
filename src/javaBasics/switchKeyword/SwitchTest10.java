package javaBasics.switchKeyword;

public class SwitchTest10 {
    public static void main(String[] args) {
        String key = "One";
        String str1 = "one";
        final String str2 = "two";

        switch(key){
//            case str1:  // compilation error, Constant expression required
//                System.out.println("This is one.");
//                break;

            case str2:  // compilation error, Constant expression required
                System.out.println("This is two.");
                break;
        }
    }
}
