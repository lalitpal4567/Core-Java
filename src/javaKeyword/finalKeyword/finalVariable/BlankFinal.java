package javaKeyword.finalKeyword.finalVariable;

public class BlankFinal {
    final boolean workDone;     // blank final
    final String task = "home work";
    static final char pressAnyKey;
    final int marks;
    BlankFinal(){
        System.out.println("constructor calling...");
        workDone = true;
    }
    {
        System.out.println("instance initializer");
        marks = 55;
    }
    static {
        System.out.println("static block");
        pressAnyKey = 'N';
    }

    public static void main(String[] args) {
        System.out.println("main method");
        BlankFinal obj = new BlankFinal();
        System.out.println(obj.workDone);
        System.out.println(obj.task);
        System.out.println(pressAnyKey);
        System.out.println(obj.marks);
    }
}
