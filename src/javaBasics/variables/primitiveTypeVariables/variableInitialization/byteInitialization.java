package javaBasics.variables.primitiveTypeVariables.variableInitialization;

// byte max value: 127
// byte min value: -128

public class byteInitialization {
    public static void main(String[] args) {
        byte age = 5;   // integer by default
        byte maxAge = +127;    // integer by default ( max value of byte )
        byte minAge = -128;     // integer by default ( min value of byte )
//        byte minAge1 = -_128;   // compilation error
    }
}
