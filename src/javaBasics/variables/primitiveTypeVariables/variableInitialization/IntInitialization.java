package javaBasics.variables.primitiveTypeVariables.variableInitialization;

// Maximum int value:   2147483647
// Minimum int value:  -2147483648

public class IntInitialization {
    public static void main(String[] args) {
        int rupees = 0000;      // ( decimal number)
        int rupees1 = 01;       // ( octal number )
        int rupees2 = 0b011;    // ( b / B -> binary number )
        int rupees3 = 0x0ff;    // ( x / X | h / H -> hex number )
        int rupees4 = 0X0FF;    // ( hex number )
        int rupees5 = 0xffffffff;   // ( hex number )
//        int rupees6 = 0xfffffffff;  // integer number too large

        System.out.println(rupees);     // 0
        System.out.println(rupees1);    // 1
        System.out.println(rupees2);    // 3
        System.out.println(rupees3);    // 255
        System.out.println(rupees4);    // 255
        System.out.println(rupees5);    // -1   (doubt)

        System.out.println("----------------------------------");
        
        int million1 = 1000000;
        int million2 = 1_000_000;
//        int million3 = _1_000_000;  // compilation error
//        int million4 = 1_000_000_;  // compilation error
//        int isIntReferenceType = null;  // compilation error
//        null can only be assigned to reference type variables
        int million5 = 1__000__000;
        int million6 = 1_0__0___0____0_____0______0;

        int result = million1 + million2;
        int result1 = million2 + million2;
        int result2 = million2 + million5;
        int result3 = million5 + million6;

        System.out.println(result);     // 2000000
        System.out.println(result1);    // 2000000
        System.out.println(result2);    // 2000000
        System.out.println(result3);    // 2000000
    }
}
