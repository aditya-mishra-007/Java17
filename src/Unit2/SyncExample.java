package Unit2;

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1  = new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        });
        Thread t2  = new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println("Final Count: "+counter.getCount());
    }
}
