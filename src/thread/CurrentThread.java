package thread;

public class CurrentThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.activeCount());
        Thread obj = new Thread();
    }
}
