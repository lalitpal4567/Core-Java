package modifiers.nonAccessModifier.finalKeyword;

public class FinalDemo {
    public void zooAnimalCheckup(boolean isWeekend){
        final int rest;
        if(isWeekend){
            rest = 5;
        }else{
            rest = 20;
        }
        System.out.println(rest);

        final int[] arr = new int[5];

//        rest = 30;    // compilation error
//        arr = null;   // compilation error
    }

    public static void main(String[] args) {

    }
}
