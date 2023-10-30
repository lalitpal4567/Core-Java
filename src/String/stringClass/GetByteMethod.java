package String.stringClass;

// getBytes() method converts a String in bytes
// (1) public byte[] getBytes()
// (2) public byte[] getBytes(Charset charset)
// (3) public byte[] getBytes(String str)

public class GetByteMethod {
    public static void main(String[] args) {
        String str = "have patience";
        String str1 = "";
        String str2 = " ";
        String str3 = new String("12");

        // byte[] ascii = str.getBytes();
        // byte[] ascii = str1.getBytes();
        // byte[] ascii = str2.getBytes();
        // byte[] ascii = str3.getBytes();

        // System.out.println(Arrays.toString(ascii));

        System.out.println(str.intern());
    }
}
