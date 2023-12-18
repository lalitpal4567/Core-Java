package functionalInterface;

/*
Note*: If a functional interface includes an abstract method with the same
signature as a public method found in Object class, those methods do not count
towards the single abstract method.
 */
@FunctionalInterface
public interface FunctionalInter {
    void show();    // abstract method
    default boolean display(){ return true;}
    static void printSomething(){}
    private void showData(){}
    public String toString();   // abstract method
    public int hashCode();      // abstract method
    public boolean equals(Object o);    // abstract method
}
