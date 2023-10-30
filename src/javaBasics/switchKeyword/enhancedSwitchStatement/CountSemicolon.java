package javaBasics.switchKeyword.enhancedSwitchStatement;

public class CountSemicolon{
    public static void main(String[] args) {
        int bear = 34;

//        var result = switch(bear) {
//            case 30 -> "Grizzly"     // compilation error
//            default -> "Panda"      // compilation error
//        }       // compilation error

        var result = switch(bear) {
            case 30 -> "Grizzly";
            default -> "Panda";
        };
    }
}
