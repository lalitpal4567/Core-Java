package thread.threadMethods;

public class CurrentThreadMethod2 {
    public static void threadFun(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("main thread");
        threadFun();
    }
}
