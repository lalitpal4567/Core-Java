package thread;

class ThreadA extends Thread{
    @Override
    public void run(){
        for(int index = 0; index < 10; index++){
            System.out.println(index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class ThreadB extends Thread{
    @Override
    public void run(){
        for(int index = 10; index > 0; index--){
            System.out.println("\t" + index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadTest3 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadA b = new ThreadA();
        a.start();
//        b.start();
        ThreadB tb = new ThreadB();
        tb.start();
    }
}
