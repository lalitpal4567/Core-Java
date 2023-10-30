package javaBasics.conditionStatements.practiceProblem;

public class InitializationBeforeUse {
    public static void main(String[] args) {
        int spaceInGB;

        if(5 > 2)   // always true
            spaceInGB = 10;

        System.out.println(spaceInGB);  // no compilation error
    }
}
