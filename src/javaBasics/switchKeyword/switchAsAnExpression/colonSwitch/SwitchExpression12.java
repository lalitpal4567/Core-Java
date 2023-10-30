package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression12 {
    public static void main(String[] args) {
        String favouriteCountry = "China";

        int ranking = switch(favouriteCountry){
            case "China" :
                System.out.println("tech country");
                System.out.println("Highly populated country");
//                break;      // compilation error, not permitted in switch expression

//            case "India": return 34;    // compilation error
            case "Nepal": int rank = 66;
                            yield rank;
            case "Russia": yield 55;
            default: yield 34;
        };
        System.out.println(ranking);
//        return rank;    // compilation error
    }
}
