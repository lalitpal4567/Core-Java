package javaBasics.switchKeyword.enhancedSwitchStatement;

public class ArrowSwitch4 {
    public static void main(String[] args) {
        String choice = "A";

        switch(choice){
            case "A" -> System.out.println("A for Apple");
//            System.out.println("A for Address");  // compilation error

            case ("B") -> {     // no compilation error
                System.out.println("B for Boy");
                System.out.println("B for Bat");
                break;  // no compilation error (redundant)
            }

            case "C" -> {   // redundant
                System.out.println("C for Cat");
                break;      // redundant
            }               // redundant

            case ("D") ->{      // no compilation error
                System.out.println("D for Dog");
                String dogSpecies = "Labradog";
                System.out.println("Dog species: " + dogSpecies);
            }
//            break;  // compilation error

            case "E" ->{
                System.out.println("E for Eagle");
//                dogSpecies = "German Shepherd";     // compilation error
//                System.out.println(dogSpecies);     // compilation error
            }

//            case "F" -> break;  // compilation error
            case "G" -> {
                break;      // no compilation error
            }

//            case "H" ->             // compilation error
            default -> {}       // no compilation error
        }
    }
}
