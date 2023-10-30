package collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class AddMethod {
    public static void main(String[] args) {
        HashSet<Integer> room = new HashSet<>();
        for(int index = 0; index < 50; index++){
            Random obj = new Random();
            room.add(obj.nextInt(100));
        }
//        System.out.print(room);
        Iterator<Integer> i = room.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
