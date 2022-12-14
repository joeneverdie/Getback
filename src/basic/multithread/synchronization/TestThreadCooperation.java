package basic.multithread.synchronization;

class Customer {
    int amount = 10000;

    synchronized void withdraw(int input) {
        System.out.println("going to withdraw...");

        if (this.amount < input) System.out.println("less balance; waiting for deposit...");
        try {
            wait();
        } catch (Exception e) {
        }

        this.amount -= input;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int input) {
        System.out.println("going to deposit...");

        this.amount += input;
        System.out.println("deposit completed...");
        notify();
    }
}

public class TestThreadCooperation {
    public static void main(String[] args) {
        final Customer cus = new Customer();

        new Thread(() -> cus.withdraw(15000)).start();

        new Thread(() -> cus.deposit(10000)).start();
    }
}
