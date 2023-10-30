package String.trickyQuestion;

public class Question3 {
    public void roar(String roar1, StringBuilder roar2){
        roar1.concat("!!!");
        roar2.append("!!!");
    }
    public static void main(String[] args) {
        var roar1 = "roar";
        var roar2 = new StringBuilder("roar");
        new Question3().roar(roar1, roar2);
        System.out.println(roar1 + "     " + roar2);
    }
}
