package thread;

public class ThreadTwoLoops {
    public static void main(String[] args) throws InterruptedException {
        // loop one
        for(int index = 0; index < 5; index++){
            System.out.println(index);
            Thread.sleep(1000);
        }

        for(int index = 5; index > 0; index--){
            System.out.println(index);
            Thread.sleep(1000);
        }
    }
}
