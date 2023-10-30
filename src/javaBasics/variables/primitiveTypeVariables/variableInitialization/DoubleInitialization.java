package javaBasics.variables.primitiveTypeVariables.variableInitialization;

public class DoubleInitialization {
    public static void main(String[] args) {
        long accountNo = 101;   // integer by default;
        long accountNo1 = 2147483647; // integer by default ( max value of integer )
//        long accountNo2 = 2147483648;   // out of range of integer max value ( compilation error )
        long accountNo3 = 2147483648L; // ( l / L -> Long )


    }
}
