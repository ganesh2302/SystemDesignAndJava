package MultiThreading.Basics.Creation;

public class Main {
    public static void main(String[] args) {
        //Runnable
//        System.out.println("Going inside main method: "+Thread.currentThread().getName());
//        MultiThreadLearning mth = new MultiThreadLearning();
//        //thread creation happens here
//        Thread thread = new Thread(mth);
//        thread.start();
//        System.out.println("Finish main method: "+Thread.currentThread().getName());
//
        //extend Thread class
        System.out.println("Going inside main method: "+Thread.currentThread().getName());
        //Thread creation happens here
        MyThreadClass myThreadClass = new MyThreadClass();
        myThreadClass.start();
        System.out.println("Finish main method: "+Thread.currentThread().getName());



    }
}
