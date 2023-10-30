package exceptionHandling.checkedException;

import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException{
        myFxn();
        System.out.println("hello");
    }
    public static void myFxn() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
}
