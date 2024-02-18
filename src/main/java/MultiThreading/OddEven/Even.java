package MultiThreading.OddEven;

public class Even implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("even");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
