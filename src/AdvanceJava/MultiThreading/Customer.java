package AdvanceJava.MultiThreading;

class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to with draw...");

        if (this.amount < amount) {
            System.out.println("Less balance;waiting for deposit...");
            try {
                wait();
            } catch (Exception ignored) {
            }
        }
        this.amount -= amount;
        System.out.println("with draw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed...");
        notify();
    }
}

class Test {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread(() -> c.withdraw(15000)).start();
        new Thread(() -> c.deposit(10000)).start();

    }
}
