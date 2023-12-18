package functionalInterface;

@FunctionalInterface
interface MyInterface{
    void task();    // abstract method
    public String toString();   // abstract method
    public int hashCode();      // abstract method
    public boolean equals(Object o);    // abstract method
}
public class InterfaceTest implements MyInterface {
    @Override
    public void task() {

    }

    public static void main(String[] args) {

    }

}
