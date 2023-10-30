package javaBasics.enumeration;

public class ZooEnum {
    enum Animal {BIRD, FISH, MAMMAL}
    public static void printLocation(Animal a) {
        long type = switch(a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 4;
        };
        System.out.print(type);
    }

    public static void main(String[] args) {
        printLocation(Animal.MAMMAL);
    }
}
