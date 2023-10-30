package collections.vector;

import java.util.Vector;

public class AddMethod {
    public static void main(String[] args) {
        Vector<Integer> random = new Vector<>();

        for(int i = 0; i < 5; i++){
            random.add((int)(Math.random() * 5) + 1);
        }
        System.out.println(random);
    }
}
