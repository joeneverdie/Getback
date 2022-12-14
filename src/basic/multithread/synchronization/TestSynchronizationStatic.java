package basic.multithread.synchronization;

class Count {
    synchronized static void print(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);

            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class SyncStatic extends Thread {
    @Override
    public void run() {
        Count.print(1);
    }
}

class SyncStatic2 extends Thread {
    @Override
    public void run() {
        Count.print(10);
    }
}

class SyncStatic3 extends Thread {
    @Override
    public void run() {
        Count.print(100);
    }
}

class SyncStatic4 extends Thread {
    @Override
    public void run() {
        Count.print(1000);
    }
}

public class TestSynchronizationStatic {
    public static void main(String[] args) {
        SyncStatic st1 = new SyncStatic();
        SyncStatic2 st2 = new SyncStatic2();
        SyncStatic3 st3 = new SyncStatic3();
        SyncStatic4 st4 = new SyncStatic4();

        st1.start();
        st2.start();
        st3.start();
        st4.start();

    }
}
