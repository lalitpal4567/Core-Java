package javaBasics.conditionStatements.elseIfLadder;

public class BodyWeight {
    public static void main(String[] args) {
        float weight = 45.5f;

        if(weight >= 50 && weight <= 70){
            System.out.println("fit");
        }
        else if(weight < 50){
            System.out.println("couch Potato");
        }
        else {
            System.out.println("need dieting");
        }
    }
}
