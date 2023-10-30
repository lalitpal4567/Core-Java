package javaBasics.enumeration;

public enum ComplexEnum {
    WINTER("low"), SPRING("medium"), SUMMER("high"), FALL("medium");

    private final String favSeason;
    ComplexEnum(String favSeason){
        this.favSeason = favSeason;
        System.out.println("constructor call");
    }
    public void showSeason(){
        System.out.println(favSeason);
    }

    public static void main(String[] args) {
        ComplexEnum call = ComplexEnum.WINTER;
        ComplexEnum.SPRING.showSeason();
    }
}
