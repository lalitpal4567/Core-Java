package collections.hashSet;

import java.util.HashSet;
import java.util.Random;

public class SizeMethod {
    public static void main(String[] args) {
        HashSet<Integer> random = new HashSet<>();
        for(int count = 0; count < 10; count++){
            Random obj = new Random();
            random.add(obj.nextInt(20, 30));
        }

        for(Integer value : random){
            System.out.println(value);
        }
    }
}
