package javaBasics.switchKeyword;

public class SwitchTest08 {
    public static void main(String[] args) {
        String color = "Red";
        String colors = color.toLowerCase();

        switch(colors){
            case "red":
                System.out.println("Red Light");
                break;

            case "yellow":
                System.out.println("Yellow Mango");
                int num = 5;
                System.out.println(num);
                break;

            case "green":
                num = 10;   // no compilation error, must be initialized in this block before use
                System.out.println(num);
                break;

//            default: int value = num;   // compilation error, Variable 'num' might not have been initialized

            default:
                System.out.println("Initialize it before using it.");
                num = 10;
                final int value = num;
                System.out.println(value);
        }
    }
}
