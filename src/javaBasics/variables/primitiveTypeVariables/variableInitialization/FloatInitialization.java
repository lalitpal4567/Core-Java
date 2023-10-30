package javaBasics.variables.primitiveTypeVariables.variableInitialization;

// float max value: 3.4028235E38
// float min value: 1.4E-45

public class FloatInitialization {
    public static void main(String[] args) {
        float marks = 0;    // integer by default
        float marks1 = 20;  // integer by default
//        float marks2 = 20.00;    // compilation error ( double by default)
        float marks3 = 0.00f;   // ( f / F -> float )

        float million = 2000000;
        float million1 = 200.0000f;
        float million2 = 2_00.00_00f;
//        float million3 = _200.0000f;      // compilation error
//        float million4 = 200.0000_f;      // compilation error
//        float million5 = 200.0000f_;      // compilation error
//        float million6 = 200_.0000f;      // compilation error
//        float million7 = 200._0000f;      // compilation error
        float million8 = 2_0_0.0_0_0_0F;
        float million9 = 2_0__0.0___0____0_____0F;

        float result = million1 + million2;
        float result1 = million2 + million8;
        float result2 = million8 + million9;

        System.out.println(marks);  // 0.0
        System.out.println(marks1); // 20.0
        System.out.println(marks3); // 0.0

        System.out.println(result);     // 400.0
        System.out.println(result1);    // 400.0
        System.out.println(result2);    // 400.0

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
}
