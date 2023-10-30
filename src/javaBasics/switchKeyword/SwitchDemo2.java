package javaBasics.switchKeyword;

public class SwitchDemo2 {
    final int getCookies() {
        final int value = 4;
        return value;
    }
    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch(numberOfAnimals) {
            case bananas:
//            case apples:        // DOES NOT COMPILE
//            case getCookies():  // DOES NOT COMPILE
//            case cookies :      // DOES NOT COMPILE
            case 3 * 5 :
        }
    }

    public static void main(String[] args) {
        SwitchDemo2 obj = new SwitchDemo2();
        obj.feedAnimals();
    }
}
