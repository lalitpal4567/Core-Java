package String.trickyQuestion;

public class Question1 {
    public static void main(String[] args) {
        var s = "hello";
        var t = new String(s);
        if("hello".equals(s)){
            System.out.println("one");
        }
        if(t == s){
            System.out.println("two");
        }
        if(t.intern() == s){
            System.out.println("three");
        }
        if("hello" == s){
            System.out.println("four");
        }
        if("hello".intern() == t){
            System.out.println("five");
        }
    }
}
