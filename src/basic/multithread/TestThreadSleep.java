package basic.multithread;

public class TestThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestThreadSleep sl1 = new TestThreadSleep();
        TestThreadSleep sl2 = new TestThreadSleep();

//        sl1.start();
//        sl2.start();
        sl1.run();
        sl2.run();
    }
}
//class TestThreadSleep extends Thread {
//    @Override
//    public void run() {
//        System.out.println("running...");
//    }
//
//
//    public static void main(String[] args) {
//        TestThreadSleep sl1 = new TestThreadSleep();
//
//        sl1.start();
//        sl1.start();
//    }
//}