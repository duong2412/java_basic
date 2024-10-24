package thread;


class Runner extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello :"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runner2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello :"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner2());
        thread1.start();
        Thread thread2 = new Thread(new Runner2());
        thread2.start();
//        Runner runner1 = new Runner();
//        runner1.start();
//        Runner runner2 = new Runner();
//        runner2.start();

    }
}
