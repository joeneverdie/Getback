package basic.multithread.synchronization;

class Test {
    void print(int n) {
        synchronized (this) {
            for (int i =1 ;i < 6; i++) {
                System.out.println(n*i);

                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class SyncBlock extends Thread {
    Test test;

    SyncBlock(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        test.print(5);
    }
}

class SyncBlock2 extends Thread {
    Test test;

    SyncBlock2(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        test.print(100);
    }
}
public class TestSynchronizedBlock {
    public static void main(String[] args) {
        Test test = new Test();

        SyncBlock sb1 = new SyncBlock(test);
        SyncBlock2 sb2 = new SyncBlock2(test);

        sb1.start();
        sb2.start();
    }
}
