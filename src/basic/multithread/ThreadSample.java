package basic.multithread;

public class ThreadSample implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 " + ThreadState.t1.getState());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}

class ThreadState implements Runnable {

    public static Thread t1;
    public static ThreadState obj;

    @Override
    public void run() {
        ThreadSample myThread = new ThreadSample();
        Thread t2 = new Thread(myThread);

        System.out.println("The state of thread t2 after spawning it - " + t2.getState()) ;
        t2.start();

        System.out.println("The state of thread t2 after calling the start() method on it - " + t2.getState()) ;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 after calling the sleep() method on it - " + t2.getState()) ;

        try {
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState()) ;
    }

    public static void main(String[] args) {
        obj = new ThreadState();
        t1 = new Thread(obj);

        System.out.println("The state of thread t1 after spawning it - " + t1.getState());
        t1.start();
        System.out.println("The state of thread t1 after calling the start() method on it- " + t1.getState());
    }
}
