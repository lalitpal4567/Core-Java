package LambdaAndFunctionInterface;

// You can have default methods and static methods in a functional interface
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(String message);

    default void defaultMethod() {
        System.out.println("Default method implementation");
    }

    static void staticMethod() {
        System.out.println("Static method implementation");
    }
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = (message) -> System.out.println("Message: " + message);

        myFunctionalInterface.myMethod("Hello, world!");

        myFunctionalInterface.defaultMethod();

        MyFunctionalInterface.staticMethod();
    }
}
