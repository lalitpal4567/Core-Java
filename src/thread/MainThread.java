package thread;

class BlackThread extends Thread{
    String threadName;
    BlackThread(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for(int index = 0; index < 5; index++){
            System.out.println(index + " " + threadName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class MainThread {
    public static void main(String[] args) {
        BlackThread thread1 = new BlackThread("thread: 1");
        thread1.start();
        for(int val = 0; val < 5; val++){
            System.out.println(val + " main thread");
        }
    }

}
