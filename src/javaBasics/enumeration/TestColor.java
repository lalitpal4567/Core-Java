package javaBasics.enumeration;

enum Color { RED, YELLOW, WHITE, BLUE, PINK }

public class TestColor {
    Color c;
    TestColor(Color c) {
        this.c = c;
    }
    public void showInfo() {
        switch(c) {
            case RED:
                System.out.println("Blood is red.");
                break;

            case YELLOW:
                System.out.println("I like yellow background.");
                break;

            case WHITE:
                System.out.println("Sky is white.");
                break;

            case BLUE:
                System.out.println("No sky is blue.");
                break;

            case PINK:
                System.out.println("Girls like pink.");
                break;

            default:
                System.out.println("Nothing else.");
                break;
        }
    }
    public static void main(String[] args) {
        TestColor obj = new TestColor(Color.RED);
        obj.showInfo();
    }
}
