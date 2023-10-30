package javaBasics.loops.forEachLoop;

public class ForEachLoopTestDemo {
    public static void main(String[] args) {
        for(var penguin : new int[2])
            System.out.println(penguin);


        var ostrich = new Character[3];
        for(var emu : ostrich)
            System.out.println(emu);
    }
}
