package CLA;

public class SumOfInputNumber {
    public static void main(String[] num) {
        // System.out.println("num[0]: "+num[0]);
        // System.out.println("num[1]: "+num[1]);
        // System.out.println("num[2]: "+num[2]);
        // System.out.println("num[3]: "+num[3]);

        // String sum = num[0] + num[1] + num[2] + num[3]; // by default it takes string
        // System.out.println(sum); // result is the concatenation of all elements

        // ----------------------------------------------
        // int sum = Integer.parseInt(num[0]) + Integer.parseInt(num[1]) + Integer.parseInt(num[2]) + Integer.parseInt(num[3]);

        // ----------------------------------------------
        int sum = 0;
        for(int index = 0; index < num.length; index++) {
            sum+= Integer.parseInt(num[index]);
        }
        System.out.println("Sum: "+sum);
    }
}
