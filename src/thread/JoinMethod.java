package thread;

class ThreadSynchronization extends Thread{
    String thread;
    ThreadSynchronization(String thread){
        this.thread = thread;
    }

    @Override
    public void run(){
        for(int index = 0; index < 3; index++){
            System.out.println(index + " " + thread);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        ThreadSynchronization thread1 = new ThreadSynchronization("thread: 1");
        ThreadSynchronization thread2 = new ThreadSynchronization("thread: 2");
        ThreadSynchronization thread3 = new ThreadSynchronization("thread: 3");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }
}
