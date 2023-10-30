package varargs;

// Varargs is just like normal array that can take variable arguments

public class VariableParameter {
    public static void main(String... args) {       // exactly 3 dots
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
