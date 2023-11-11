package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Student {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(45);
        obj.add(50);
        obj.add(35);
        obj.add(33);
        obj.add(22);
        obj.add(29);


        Stream<Integer> stream = obj.stream();
        stream.filter((value) -> value > 40)
                .forEach((value) -> System.out.println(value));
    }
}
