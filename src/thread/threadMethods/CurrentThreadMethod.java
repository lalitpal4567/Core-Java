package thread.threadMethods;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello i am " + Thread.currentThread().getName());
        greet();
    }
    void greet() {
        System.out.println("Good morning " + Thread.currentThread().getName());
    }
}
public class CurrentThreadMethod {
    public static void main(String[] args) {
        System.out.println("Hi i am main");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
//         t1.greet();

        t2.start();
//         t2.start();  //error
//         t2.greet();
        System.out.println("Hii i am main");

    }
}
