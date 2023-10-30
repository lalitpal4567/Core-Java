package javaBasics.conditionStatements.practiceProblem;

public class InitializationBeforeUse2 {
    public static void main(String[] args) {
        int counter;

        int a = 5;
        int b = 10;

        if(a < b)
            counter = 100;

//        System.out.println(counter);    // compilation error (must be initialized before use)
    }
}
