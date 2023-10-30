package javaBasics.conditionStatements.ifElseBlock;

public class IfElseWithoutBraces2 {
    public static void main(String[] args) {
        int temperature = 3;
        long humidity = -temperature + temperature * 2;
        int windSpeed = 5;

        if (temperature >= 4)
            if (humidity < 6)
                if(windSpeed > 3)
                    System.out.println("Too Low");
        else System.out.println("Just Right");
        else System.out.println("Too High");
        else System.out.println("moderate");
    }
}
