package javaKeyword.staticKeyword;

public class PolarBear {
    int totalBears = 100;
    static int bearsPerGroup = 25;
//    static int totalGroups = totalBears / bearsPerGroup;    // compilation error

    int totalBearGroups = totalBears / bearsPerGroup;

    public static void main(String[] args) {
        System.out.println(new PolarBear().totalBearGroups);
    }
}
