package thread;

public class MainThread2 extends Thread{
    String threadName;
    MainThread2(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i + " " + threadName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MainThread2 thread1 = new MainThread2("thread: 1");
        thread1.start();
        for(int i = 0; i < 5; i++){
            System.out.println(i + " main thread");
            Thread.sleep(1000);
        }
    }
}
