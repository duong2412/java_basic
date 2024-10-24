package thread;

public class TestThread {
    synchronized void notifyThread(){
        notifyAll();
    }
    public static void main(String[] args) {
        //wait - chờ cho đến khi đc đánh thức
        //notify - đánh thức 1 thread đang wait
        //notify all - đánh thức tất cả các thread đang wait

        //String pool
        CountPlus countPlus = new CountPlus();
        countPlus.plus();
//        final TestThread tt = new TestThread();
//        Thread t3 =  new Thread(new Runnable() {
//            @Override
//            public void run() {
//                tt.notifyThread();
//            }
//        });
//        t3.start();
    }
}
