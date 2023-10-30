package nestedClass.innerClass;

public class Home {
    private String greeting = "hi";

    protected class Room{
        public int repeat = 3;
        public void enter(){
            for(int i = 0; i < repeat; i++){
                greet(greeting);
            }
        }
        public static void greet(String message){
            System.out.println(message);
        }
    }
    public void enterRoom(){
        Room room = new Room();
        room.enter();
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.enterRoom();
    }
}
