package thread;

public class CountPlus {
    public int count =0;
    public int count2 = 0;
    public int count3 = 0;

    public synchronized void increment(){
        count++;
//        try {
//            wait(); //chờ cho đến khi đc đánh thức
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public void plus(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                    count2++;
                }

            }

        });

        t1.start(); // phuong thuc start dung de chay 1 luong
        t2.start();

        try {
            t1.join(); // phuong thuc join dung de đợi... khi chạy xong luồng mới chạy tiếp luồng chính
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





        System.out.println("Gia tri count = "+ count);
        System.out.println("Gia tri count2 = "+ count2);


    }
}
