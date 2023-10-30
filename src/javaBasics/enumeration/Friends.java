package javaBasics.enumeration;

public enum Friends {
    Lalit, Sachin, Akash, Azad, Deepesh;

    public static void main(String[] args) {
        System.out.println("displaying enum constants...");
        System.out.println(Friends.Akash.name());
    }
}
