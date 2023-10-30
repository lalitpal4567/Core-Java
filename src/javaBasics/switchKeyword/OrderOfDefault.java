package javaBasics.switchKeyword;


public class OrderOfDefault {
    public static void main(String[] args) {
        String animal = "Lion";

        switch(animal){
            case "Elephant":
                System.out.println("Its weight is 600kg");
                break;
            default:
                System.out.println("It is not an animal.");
                break;
            case "Lion":
                System.out.println("Its weight is 200kg");
                break;
            case "Whale":
                System.out.println("Its weight is 1000kg");
                break; // optional as it is last statement
        }
    }
}
