package thread;

public class ThreadTest extends Thread {
    public void run(){
        for(int i = 1; i < 5; i++){
            System.out.println(i++);
        }
    }
    public static void main(String[] args) {
        ThreadTest obj = new ThreadTest();
        obj.run();
    }
}
