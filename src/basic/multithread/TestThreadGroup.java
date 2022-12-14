package basic.multithread;

public class TestThreadGroup implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        TestThreadGroup test = new TestThreadGroup();
        ThreadGroup group = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(group, test, "one");
        t1.start();

        Thread t2 = new Thread(group, test, "two");
        t2.start();

        Thread t3 = new Thread(group, test, "three");
        t3.start();

        System.out.println("Thread Group Name: " + group.getName());
        group.list();
    }
}
