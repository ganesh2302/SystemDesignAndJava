package MultiThreading.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class MainReenterant {
    public static void main(String[] args) {
        SharedResourceReenterant res = new SharedResourceReenterant();
        ReentrantLock relock = new ReentrantLock();
        Thread t1 = new Thread(()->{
           res.producer(relock);
        });

        Thread t2 = new Thread(()->{
           res.producer(relock);
        });

        t1.start();
        t2.start();
    }
}
