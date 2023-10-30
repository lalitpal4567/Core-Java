package collections.arrayList.arrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lalit Pal
 */

// addAll(Collection<? extends E> c) appends all of the elements in the specified collection
// to the end of this list, in the order that they are returned
// by the specified collection's Iterator.
// It returns boolean value.
// NullPointerException - if the specified collection is null
// public boolean addAll(Collection<? extends E> c)

public class AddAllMethod1 {
    public static void main(String[] args) {
        String[] carName = new String[]{"Mahindra", "Renault", "Skoda", "Baleno", "Audi", "Mercedes"};
        List<String> carList = Arrays.asList(carName);

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(carList);
        System.out.println(cars);

        System.out.println("--------------------------------");
        LinkedList<Integer> houseNo = new LinkedList<>();
        houseNo.add(10);
        houseNo.add(20);
        houseNo.add(15);
        houseNo.add(9);

        ArrayList<Integer> numberPlate = new ArrayList<>();
        numberPlate.addAll(houseNo);
        System.out.println(numberPlate);

        System.out.println("--------------------------------");
        ArrayList<Long> mobileNo = new ArrayList<>();
        mobileNo.addAll(null);  // NullPointerException
        System.out.println(mobileNo);
    }
}
