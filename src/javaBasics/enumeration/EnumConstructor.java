package javaBasics.enumeration;

enum ColorFlowers { LOTUS, ROSE, JASMINE, DAISY, SUNFLOWER;
    ColorFlowers(){
        System.out.println("Hi");
    }
}
public class EnumConstructor {
    public static void main(String[] args) {
        ColorFlowers obj = ColorFlowers.ROSE;
    }
}
