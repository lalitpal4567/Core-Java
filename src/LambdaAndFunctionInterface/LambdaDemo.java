package LambdaAndFunctionInterface;

interface StringLength{
    int strLength(String str);
}
public class LambdaDemo {
    public static void main(String[] args) {
        String str = "hello";
        StringLength length = (str2) -> str2.length();

        int newLength = length.strLength(str);
        System.out.println(newLength);
    }
}
