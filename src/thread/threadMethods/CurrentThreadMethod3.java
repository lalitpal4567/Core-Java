package thread.threadMethods;

public class CurrentThreadMethod3 implements Runnable{
    @Override
    public void run(){
        System.out.println("welcome " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        CurrentThreadMethod3 obj = new CurrentThreadMethod3();
        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj);
        thread1.start();
        thread2.start();
    }
}
