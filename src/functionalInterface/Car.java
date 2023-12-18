package functionalInterface;

@FunctionalInterface
interface Key{
    void insertKey();
}

public class Car implements Key {
    @Override
    public void insertKey(){
        System.out.println("inserting key...");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.insertKey();
    }
}
