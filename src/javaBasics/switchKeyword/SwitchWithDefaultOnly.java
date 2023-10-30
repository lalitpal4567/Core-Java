package javaBasics.switchKeyword;

public class SwitchWithDefaultOnly {
    public static void main(String[] args) {
        String city = "Noida";

        switch(city){
            default:
                System.out.println("Mumbai");
//                break;
                System.out.println("Noida");    // Unreachable statement
                System.out.println("Chennai");
//                break;
                System.out.println("Bangalore");    // Unreachable statement
                System.out.println("Hyderabad");
                break;  // no compilation error (optional)
        }
    }
}
