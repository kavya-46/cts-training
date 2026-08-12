package com.Threads;
//data inconsistency and thread synchronization
public class MultiDemo4 implements Runnable{
int x;
public synchronized void run() {
for(int i=1;i<=1000;i++) {
    x++; //increasing the val
}
        }
    public static void main(String[] args) {
MultiDemo4 m1 = new MultiDemo4();
Thread t1 = new Thread(m1);
Thread t2 = new Thread(m1);

      //  System.out.println(t1.isAlive()); //to know abt thread is in live or dead state
t1.start();
t2.start();
t1.setName("my threadone");
t2.setName("my threadtwo");
        System.out.println(t1.isAlive());
        System.out.println(t1.getName());
//        t1.setPriority(2);
//        t2.setPriority(4);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//by using join,the sout statements will be printed after the thread execution
        System.out.println(m1.x);

        System.out.println("hi");

}
}

//SYNCHRONIZATION - When one obj is used in mutliple threads,then data inconsistency occurs,
//to avoid that, synchronization technique is used
//2 threads cannot acces synchronised object