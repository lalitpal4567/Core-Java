package collections.hashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ForEachMethod {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        for(int index = 0; index < 10; index++){
            Random obj = new Random();
            num.add(obj.nextInt(50, 100));
        }
        num.forEach((value)-> System.out.println(value));
    }
}
