package basic.multithread.synchronization;

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i < 6; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    Table t;

    MyThread(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronization {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread m1 = new MyThread(obj);
        MyThread2 m2 = new MyThread2(obj);
        m1.start();
        m2.start();
    }
}
