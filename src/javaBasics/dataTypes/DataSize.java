package javaBasics.dataTypes;

// Java program to print the size of all primitive data types

public class DataSize {
    public static void main(String[] args) {
        // size in bits
        // System.out.println("int: " + Integer.SIZE);    // 32
        // System.out.println("float: " + Float.SIZE);    // 32
        // System.out.println("char: " + Character.SIZE); // 16
        // System.out.println("double: " + Double.SIZE);  // 64
        // System.out.println("short: " + Short.SIZE);    // 16
        // System.out.println("long: " + Long.SIZE);      // 64
        // System.out.println("byte: " + Byte.SIZE);      // 8
        // System.out.println("boolean: " + Boolean.SIZE);


        // size in bytes
        System.out.println("int: " + Integer.SIZE / 8);    // 4
        System.out.println("float: " + Float.SIZE / 8);    // 4
        System.out.println("char: " + Character.SIZE / 8); // 2
        System.out.println("double: " + Double.SIZE / 8);  // 8
        System.out.println("short: " + Short.SIZE / 8);    // 2
        System.out.println("long: " + Long.SIZE / 8);      // 8
        System.out.println("byte: " + Byte.SIZE / 8);      // 1
    }
}

