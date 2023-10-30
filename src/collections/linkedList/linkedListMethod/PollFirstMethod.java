package collections.linkedList.linkedListMethod;

import java.util.LinkedList;

// pollFirst() method removes and returns the first element of the linkesList.
// (1) public T pollFirst()

public class PollFirstMethod {
    public static void main(String[] args) {
        LinkedList<String> vehicle = new LinkedList<>();
        vehicle.add("Scooter");
        vehicle.add("Bike");
        vehicle.add("Bicycle");
        vehicle.add("Car");
        vehicle.add("Bus");
        vehicle.add("Truck");
        vehicle.add("Van");
        vehicle.add("Tractor");
        System.out.println(vehicle);

        System.out.println(vehicle.pollFirst());  // Scooter
        System.out.println(vehicle.pollFirst());  // Bike
        System.out.println(vehicle);
    }
}
