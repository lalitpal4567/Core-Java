package thread;

class NewbornThread extends Thread{
    String threadName;
    NewbornThread(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(i + " " + threadName);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class NewThread {
    public static void main(String[] args) {
        NewbornThread thread1 = new NewbornThread("one");
        NewbornThread thread2 = new NewbornThread("two");
        NewbornThread thread3 = new NewbornThread("three");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
