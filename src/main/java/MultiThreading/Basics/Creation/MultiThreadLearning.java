package MultiThreading.Basics.Creation;

public class MultiThreadLearning implements Runnable{
    @Override
    public void run() {
        System.out.println("thread: "+Thread.currentThread().getName());
    }
}
