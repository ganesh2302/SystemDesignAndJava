package MultiThreading.OddEven;


public class OddEvenThreadMain {

    public static void main(String[] args) {
        System.out.println("Going inside main method: "+Thread.currentThread().getName());
        Even even = new Even();
        Thread evenTh = new Thread(even);
        evenTh.start();

        Odd odd = new Odd();
        Thread oddTh = new Thread(odd);
        oddTh.start();
        System.out.println("Finish main method: "+Thread.currentThread().getName());
    }
}
