package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class TextStream {
    public static void main(String[] args) {
        String[] text = new String[]{"This", " is", "text"};
//        Arrays.stream(text).toList();

        Stream<String> stream = Arrays.stream(text);
        stream.filter((word) -> word.length() > 3)
                .map((newword) -> newword.concat("Lalit"))
                .forEach(System.out::println);
    }
}
