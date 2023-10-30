package thread;

public class ThreadTest2 extends Thread{
    @Override
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String[] args) {
        ThreadTest2 obj = new ThreadTest2();
        obj.start();
    }
}
