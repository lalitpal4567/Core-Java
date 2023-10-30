package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

import java.sql.SQLOutput;

enum FavouritePlace{ INDIA_GATE, RED_FORT, TAJ_MAHAL, CHAR_MINAR, KAMAL_TEMPLE };
public class SwitchEnumExpression2 {
    public static void main(String[] args) {
        FavouritePlace place = FavouritePlace.TAJ_MAHAL;

        String star = switch(place){
            case INDIA_GATE:
                System.out.println("8 out of 10");
            case TAJ_MAHAL: yield "9 out of 10";
            case KAMAL_TEMPLE:      // no compilation error
            case CHAR_MINAR: {};    // no compilation error
            case RED_FORT:
                System.out.println("4 out of 10");
                yield "4 out of 10";
            default: yield "1 out of 10";   // unnecessary, redundant
        };
        System.out.println("Stars: " + star);
    }
}
