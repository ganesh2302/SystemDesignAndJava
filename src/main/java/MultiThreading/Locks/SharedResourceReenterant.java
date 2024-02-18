package MultiThreading.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceReenterant {

    boolean isAvailable = false;
    //ReentrantLock lock = new ReentrantLock();

    public void producer(ReentrantLock relock) {
        try {
            relock.lock();
            System.out.println("lock acquired" + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {

        }finally {
            relock.unlock();
            System.out.println("lock released"+Thread.currentThread().getName());
        }
    }
}
