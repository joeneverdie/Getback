package basic.multithread;

import java.util.Collection;

public class TestInterruptedThread extends Thread {
//    @Override
//    public void run() {
//       try {
//           Thread.sleep(1000);
//           System.out.println("task");
//       } catch (InterruptedException e) {
//           try {
//               throw new InterruptedException("Thread interrupted..." + e);
//           } catch (InterruptedException ex) {
//               throw new RuntimeException(ex);
//           }
//       }
//    }
//
//    public static void main(String[] args) {
//        TestInterruptedThread test = new TestInterruptedThread();
//        test.start();
//
//        try {
//            test.interrupt();
//        } catch (Exception e) {
//            System.out.println("Exception handled " + e);
//        }
//    }


//    @Override
//    public void run() {
//       try {
//           Thread.sleep(1000);
//           System.out.println("task");
//       } catch (InterruptedException e) {
//           System.out.println("Exception handled..." + e);
//       }
//       System.out.println("Thread is running...");
//    }
//
//    public static void main(String[] args) {
//        TestInterruptedThread test = new TestInterruptedThread();
//        test.start();
//
//        test.interrupt();
//    }


//    @Override
//    public void run() {
//        for (int i = 0; i < 6; i++) {
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) {
//        TestInterruptedThread test = new TestInterruptedThread();
//        test.start();
//        test.interrupt();
//    }


    @Override
    public void run() {
       for (int i = 0; i <= 2; i++) {
           if (Thread.interrupted()) {
               System.out.println("code for interrupted thread");
           } else System.out.println("code for normal thread");
       }
    }

    public static void main(String[] args) {
        TestInterruptedThread test1 = new TestInterruptedThread();
        TestInterruptedThread test2 = new TestInterruptedThread();

        test1.start();
        test1.interrupt();

        test2.start();
    }
}