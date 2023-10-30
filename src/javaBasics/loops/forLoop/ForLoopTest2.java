package javaBasics.loops.forLoop;

public class ForLoopTest2 {
    public static void main(String[] args) {
        int a = 0;
//        for(System.out.println("hi");;);    // valid

//        ------------------------------------------------------
//        for(System.out.println("hello");;){}    // valid

//        ------------------------------------------------------

//        for(System.out.println("welcome"); a < 5;){
//            System.out.println("nice to meet you");   // valid
//        }

//        ------------------------------------------------------

//        for(System.out.println("hello"); ; System.out.println("hi"));    // valid

        for (System.out.println("hello"); a < 5 ; System.out.println("hi")){
            System.out.println("bye");
            a++;
        }
    }
}
