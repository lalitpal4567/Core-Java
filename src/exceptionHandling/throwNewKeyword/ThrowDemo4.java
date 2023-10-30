package exceptionHandling.throwNewKeyword;

public class ThrowDemo4 {
    public static void eligibleForVote(int age) {
        if(age >= 18) {
            System.out.println("can vote");
        }
        else {
            throw new ArithmeticException("can't vote");
        }
    }

    public static void main(String[] args){
        int age = 14;
        eligibleForVote(age);
    }
}
