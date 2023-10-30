package javaBasics.variables.primitiveTypeVariables.variableInitialization;

// short max value: 32767
// short min value: -32768

public class ShortInitialization {
    public static void main(String[] args) {
        short distance = 5000;  // integer by default
        short distance1 = 32767; // integer by default ( byte max value )
//        short distance2 = 32768;    // integer by default ( greater than byte max value ) compilation error
        short distance3 = -32768;   // integer by default ( byte min value )
    }
}
