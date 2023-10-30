package sop;

import java.util.Scanner;

public class PrintlnMethod {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(true); // boolean
        // System.out.println(True); // error case sensitive
        System.out.println("true"); // string
        System.out.println('J'); // char
        // System.out.print(); // error
        System.out.print(true); // without new line
        System.out.println(); // new line
        System.out.println("\n");   // two new line
        System.out.println((2 > 3) ? "good" : "poor");
//        System.out.println(09); // error big value
//        System.out.println(08);    // error big value
        System.out.println(07); // 7
        System.out.println(9); // int 9
        System.out.println(15.2f); // float 15.2
        System.out.println(12.36); // double by default
        // System.out.println(hi!); // error
        System.out.println("hi!"); // string
        System.out.println(2 + 3); // 5
        System.out.println(5 - 6); // -1
        System.out.println(10 / 2); // 5
        System.out.println(7 / 2);  // 3
        System.out.println(10 % 3); // 1
        System.out.println(5 * 2); // 10
        System.out.println(00000);  // 0
        System.out.println(11111);   // 11111
        System.out.println(011);    // 9 (octal number)
//        System.out.println(018);    // error (not an octal number)
        System.out.println(0b11);   // 3 (binary number)
        System.out.println(0B11);   // 3 (binary number)
        System.out.println(0x1F);   // 31 (hex number)
        System.out.println(0X1F);   // 31 (hex number)
        System.out.println(10 + 2 - 14 / 2 * 3); // -9
        System.out.println(2 > 3); // false
        System.out.println(2 >> 3);
        System.out.println(2 >>> 3);
        // System.out.println(2>>>>3); // error not exception
        System.out.println(2 < 3); // true
        System.out.println(2 << 500); // 2097152
        // System.out.println(2<<<10000); // error
        System.out.println(true | false); // or
        System.out.println(true && false); // and
        System.out.println(false ^ false); // xor
        System.out.println(!true); // not

        char[] ch = {'w', 'w', 'e'};
        System.out.println(ch); // wwe

        char ch1 = 65;
        System.out.println(ch1); // A


        System.out.println("Long time no see");
        System.out.println("");
        System.out.println("" + 420);
        System.out.println("       " + 80);
        System.out.println("Long" + "time" + "no" + " see");
        System.out.println("My contact no. is: " + 9872958038L);
        // System.out.println(2+3+" "+7-6);
        System.out.println(2 + 3 + " " + 5 + 3);
        System.out.println(2 + 3 + " " + (5 + 3));
        System.out.println("" + 8 + 8); // 88
        System.out.println("" + (8 + 8)); // 16
        System.out.println(1 + 2 + " " + (8 - 2) + " " + (10 % 3) + " " + (20 / 10) + " bye");
        System.out.println("12" + 22); // 1222 string
        System.out.println("12" + "22"); // 1222 string
        System.out.println(50 + " " + 4 + 7); // 50 47

        // ===============================
        System.out.println("Enter a value: ");
        System.out.println(input.nextInt());

        PrintlnMethod obj = new PrintlnMethod();
        System.out.println(obj); // PrintlnMethod@2c7b84de
    }
}
