package collections.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class PushMethod {
    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj);

        // pushing another collection into the stack
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(40, 50, 60));
        for(Integer value : num){
            obj.push(value);
        }
        System.out.println(obj);

        // pushing another collection using allAll method
        LinkedList<Integer> newNum = new LinkedList<>(Arrays.asList(70, 80, 90));
        obj.addAll(newNum);
        System.out.println(obj);
    }
}
