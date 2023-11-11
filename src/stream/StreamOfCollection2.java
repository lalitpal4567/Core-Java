package stream;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class StreamOfCollection2 {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        Random random = new Random();

        for(int count = 0; count < 15; count++){
            age.add(random.nextInt(1, 30));
        }

        Stream<Integer> stream = age.stream();
        stream.filter(value -> value > 10)
                .map(ele -> ele * 2)
                .distinct()
                .forEach(System.out::println);
    }
}
