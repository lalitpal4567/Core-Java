package functionalInterface.builtInFunctionalInterface.consumerInterface;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> message = (str) -> System.out.println(str);
        Consumer<Integer> num = System.out::println;

        message.accept("see you");
        num.accept(3434);
    }
}
