package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression15 {
    enum Friend{ LALIT,SACHIN, VISHAL, AZAD, DEEPESH, AJAY };

    public static void main(String[] args) {
        Friend newFriend = Friend.VISHAL;

        String result = switch(newFriend){
            case VISHAL: yield Friend.AJAY.toString();
//            case DEEPESH: yield LALIT;      // compilation error

            case AJAY:
                System.out.println("this is ajay");
                yield Friend.SACHIN.toString();

            default: yield "Invalid friend name";
        };
        System.out.println(result);
    }
}
