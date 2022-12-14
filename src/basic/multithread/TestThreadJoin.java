package basic.multithread;

class ThreadJoin extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(300);
                System.out.println("Current thread name " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class TestThreadJoin {
    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.start();
//        try {
//            System.out.println("The current thread name is " + Thread.currentThread().getName());
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        t2.start();
//        try {
//            System.out.println("The current thread name is " + Thread.currentThread().getName());
//            t2.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        t3.start();
//        try {
//            System.out.println("The current thread name is " + Thread.currentThread().getName());
//            t3.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
