package basic.multithread.synchronization;

public class DeadlockSolved {
    public static void main(String[] args) {
        DeadlockSolved test = new DeadlockSolved();

        final Resource1 rc1 = test.new Resource1();
        final Resource2 rc2 = test.new Resource2();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                synchronized (rc2) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {}

                    synchronized (rc1) {
                        System.out.println("In block 1");
                    }
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                synchronized (rc2) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {}

                    synchronized (rc1) {
                        System.out.println("In block 2");
                    }
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }

    private class Resource1 {
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    private class Resource2  {
        private int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
