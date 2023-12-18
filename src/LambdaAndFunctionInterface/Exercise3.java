package LambdaAndFunctionInterface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Exercise3 {
    public void method(){
        x((var x) -> {}, (var x, var y) -> false);
    }
    public static void x(Consumer<String> x, BinaryOperator<Boolean> y){

    }
    public static void main(String[] args) {

    }
}
