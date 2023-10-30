package javaBasics.enumeration;

// Main method inside enum

public enum MainInsideEnumWithoutClass {
    INDIA, PAKISTAN, SRI_LANKA, NEPAL, BHUTAN;

    public static void main(String[] args) {
        MainInsideEnumWithoutClass s = MainInsideEnumWithoutClass.INDIA;
        System.out.println(s);

        s = MainInsideEnumWithoutClass.SRI_LANKA;
        System.out.println(s);
    }
}
