package String.stringClass;

public class TripleQuote {
    public static void main(String[] args) {
        String str = """
                Hello""";

        // valid
        String str2 = """      
                Hi
                """;

        // compilation error
//        String str3 = """       // valid
//                Welcome""";

        System.out.println(str.length());
    }
}
