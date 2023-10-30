package collections.stack;

import java.util.Stack;

public class SizeMethod {
    public static int getSize(Stack color){
        return color.size();
    }

    public static void main(String[] args) {
        Stack<String> color = new Stack<>();
        color.push("red");
        color.push("yellow");
        color.push("black");
        color.push("violet");

        System.out.println(color);
        System.out.println(getSize(color));
    }
}
