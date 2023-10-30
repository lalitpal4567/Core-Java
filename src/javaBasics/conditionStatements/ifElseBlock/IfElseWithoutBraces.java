package javaBasics.conditionStatements.ifElseBlock;

public class IfElseWithoutBraces {
    public static void main(String[] args) {
        int temperature = 4;
        long humidity = -temperature + temperature * 2;

        if (temperature >= 4)
            if (humidity < 6) System.out.println("Too Low");
        else System.out.println("Just Right");
        else System.out.println("Too High");
//         else System.out.println("hi");       // compilation error
    }
}
