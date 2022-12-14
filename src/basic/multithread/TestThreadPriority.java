package basic.multithread;

public class TestThreadPriority extends Thread {
    @Override
    public void run() {
        System.out.println("Inside the run() method");
    }

    public static String displayCurrentPriority(TestThreadPriority test) {
        return "Priority of the thread "
                + test.getName()
                + " is "
                + test.getPriority();
    }

    public static void main(String[] args) {
        TestThreadPriority t1 = new TestThreadPriority();
        TestThreadPriority t2 = new TestThreadPriority();
        TestThreadPriority t3 = new TestThreadPriority();

        System.out.println(displayCurrentPriority(t1));
        System.out.println(displayCurrentPriority(t2));
        System.out.println(displayCurrentPriority(t3));

        t1.setPriority(3);
        t2.setPriority(9);
        t3.setPriority(6);

        System.out.println(displayCurrentPriority(t1));
        System.out.println(displayCurrentPriority(t2));
        System.out.println(displayCurrentPriority(t3));

        System.out.println("Currently executing the thread :" + Thread.currentThread().getName());
        System.out.println("Priority of the main thread :" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);

        System.out.println("Priority of the main thread :" + Thread.currentThread().getPriority());
    }
}