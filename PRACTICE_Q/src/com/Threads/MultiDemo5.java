package com.Threads;

public class MultiDemo5 implements Runnable{
    public void run() {
        System.out.println("welcome to DAEMON thread");
    }
    public static void main(String[] args) {
MultiDemo5 m1 = new MultiDemo5();
Thread t1 = new Thread(m1);
//Thread.currentThread().setDaemon(true); - illegal exception- we cannot make main method as daemon thread
t1.setDaemon(false); //background processing will be done
// after other threads exec is done then it will also stop
t1.start();
       // t1.setDaemon(true); - illegalThreadStateException method,bcoz after starting of the thread , we cannot convert it into daemon thread
        System.out.println(t1.isDaemon());
        System.out.println(Thread.currentThread().isDaemon());
//        System.out.println(Thread.currentThread().isInterrupted());
//        System.out.println(Thread.currentThread().isVirtual());

    }
}
