package collections.arrayList.arrayListMethods;

import java.util.ArrayList;

// Increases the capacity of this ArrayList instance, if necessary, to ensure that it
// can hold at least the number of elements specified by the minimum capacity argument.
// (1) public void ensureCapacity(int minCapacity)

public class EnsureCapacityMethod {
    public static void main(String[] args) {
//        When we first create an ArrayList object, the size of the internal array is 10 i.e.
//        default initial capacity of the ArrayList.
        ArrayList<Float> pocketMoney = new ArrayList<>();


//        We can use the ArrayList constructor with initial capacity as an argument.
//        It initializes the arrayList with initial capacity of 20.
        ArrayList<Float> wallet = new ArrayList<>(20);

//        If you know the estimated size of the ArrayList, it is always better to specify the initial capacity
//        when creating the ArrayList. Doing so will increase the performance of your application as it does not
//        have to de-allocate and re-allocate the internal array when ArrayList grows beyond the capacity.

//        If you want to increase the capacity of existing ArrayList, use ensureCapacity method.
//        This method increases the capacity of the ArrayList, if required so that it can hold at least the number
//        of elements equal to the specified capacity.
        wallet.ensureCapacity(40);


    }
}
