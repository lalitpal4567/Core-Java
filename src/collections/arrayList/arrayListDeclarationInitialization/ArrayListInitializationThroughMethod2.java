package collections.arrayList.arrayListDeclarationInitialization;

import java.util.ArrayList;

// (2) public void add(int index, Object/E element)  // E -> data type

public class ArrayListInitializationThroughMethod2 {
    public static void main(String[] args) {
        ArrayList<Byte> date = new ArrayList<>();
        date.add((byte) 12);
        date.add((byte) 15);
        date.add((byte) 20);

        date.add(1, (byte) 50);
        date.add(4, (byte) -128);
//        date.add(7,18);   // IndexOutOfBoundsException
//        date.add(-1,20);  // IndexOutOfBoundsException

        System.out.println(date);
    }
}
