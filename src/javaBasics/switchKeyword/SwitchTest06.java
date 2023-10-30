package javaBasics.switchKeyword;

public class SwitchTest06 {
    public static void main(String[] args) {
        int choice = 2;

        switch(choice){
            case 1:
                System.out.println("One");
                System.out.println("1");
                break;

            case 2:{
                System.out.println("Two");
                System.out.println(2);
            }break;         // no compilation error

            case 3: {
                System.out.println("Three");
                System.out.println(3);
                break;
            }
            default: break;
        }
    }
}
