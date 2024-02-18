package MultiThreading.Basics.Creation;

public class MyThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("Inside thread class: "+Thread.currentThread().getName());
    }
}
