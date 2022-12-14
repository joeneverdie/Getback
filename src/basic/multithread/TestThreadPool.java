package basic.multithread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

    private String message;

    WorkerThread(String msg) {
        this.message = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " (Start) message = "
                + message);
        processmessage();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TaskTest implements Runnable {
    private String taskName;

    TaskTest(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                if (i == 0) {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

                    System.out.println("Initialization time for the task name: "
                            + taskName + " = "
                            + sdf.format(date));
                } else {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

                    System.out.println("Time of execution for the task name: "
                            + taskName + " = "
                            + sdf.format(date));
                }
                Thread.sleep(1000);
            }
            System.out.println(taskName + " is complete.");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

public class TestThreadPool {
//    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 10; i++) {
//            Runnable worker = new WorkerThread("" + i);
//            executorService.execute(worker);
//        }
//        executorService.shutdown();
//        while (!executorService.isTerminated()) {
//        }
//
//        System.out.println("Finished all threads");
//    }

    static final int MAX_TH = 3;

    public static void main(String[] args) {
        Runnable r1 = new TaskTest("task 1");
        Runnable r2 = new TaskTest("task 2");
        Runnable r3 = new TaskTest("task 3");
        Runnable r4 = new TaskTest("task 4");
        Runnable r5 = new TaskTest("task 5");

        ExecutorService service = Executors.newFixedThreadPool(MAX_TH);

        service.execute(r1);
        service.execute(r2);
        service.execute(r3);
        service.execute(r4);
        service.execute(r5);

        service.shutdown();
    }
}
