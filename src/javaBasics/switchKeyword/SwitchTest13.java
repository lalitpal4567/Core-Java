package javaBasics.switchKeyword;

public class SwitchTest13 {
    public static void main(String[] args) {
        byte choice = 25;
        final int value = 5;
        final short value2 = 20;
        final long value3 = 40;

        switch(choice){
            case value + 1:{
                System.out.println("Six");
                short num = 40;
                int result = (int)Math.pow(40, 2);
                System.out.println("Result: " + result);
            }break;

            case value2 + 10:
                System.out.println("Fifteen");
//                result = 1000;  // compilation error
                float num1 = 7;
                int num2 = 5;
//                int result = num1 / num2;   // compilation error
                float result2 = num1 / num2;
                System.out.println("Result: " + result2);
                break;

//            case value3:{};   // compilation error

            case value + value2:{
                System.out.println("Twenty-five");
//                System.out.println(result2);  // compilation error, must be initialized before using it
                num1 = 8;
                num2 = 5;
                result2 = num1 % num2;
                System.out.println(result2);
                break;
            }

            case 88:
                System.out.println("reusing the variables of previous case");
//                System.out.println(num1);   // must be initialized before use
                num1 = 10;
                num2 = 20;
                System.out.println("num1 + num2: " + num1 + num2);

            default: { break;}
        }
    }
}
