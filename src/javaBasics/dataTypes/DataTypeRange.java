package javaBasics.dataTypes;

// Java program to show the Min and Max value of each primitive data type
// Character and Boolean do not have Min and Max value

public class DataTypeRange {
    public static void main(String[] args) {
        System.out.println("Data Type\tSize (Bytes)\tMin Value\t\t\t\tMax Value");
        System.out.println("byte\t\t" + Byte.SIZE / 8 + "\t\t\t\t" + Byte.MIN_VALUE + "\t\t\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t\t" + Short.SIZE / 8 + "\t\t\t\t" + Short.MIN_VALUE + "\t\t\t\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t\t" + Integer.SIZE / 8 + "\t\t\t\t" + Integer.MIN_VALUE + "\t\t\t\t" + Integer.MAX_VALUE);
        System.out.println("float\t\t" + Float.SIZE / 8 + "\t\t\t\t" + Float.MIN_VALUE + "\t\t\t\t\t" + Float.MAX_VALUE);
        System.out.println("long\t\t" + Long.SIZE / 8 + "\t\t\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("double\t\t" + Double.SIZE / 8 + "\t\t\t\t" + Double.MIN_VALUE + "\t\t\t\t" + Double.MAX_VALUE);
        System.out.println("char\t\t" + Character.SIZE / 8 + "\t\t\t\t" + Character.MIN_VALUE + "\t\t\t\t" + Character.MAX_VALUE);  // ?
    }
}
