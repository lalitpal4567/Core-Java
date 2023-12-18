package functionalInterface;

@FunctionalInterface
interface Message{
    void displayMessage(String message);
}
public class Greeting implements Message{
    @Override
    public void displayMessage(String message){
        System.out.println("Welcome to Goa " + message);
    }
    public static void main(String[] args) {
        Greeting greet = new Greeting();
        greet.displayMessage("Singham");

    }
}
