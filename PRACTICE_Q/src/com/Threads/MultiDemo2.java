package com.Threads;
//current thread method
class MultiDemo2 implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
    public static void main(String[] args) {
MultiDemo2 m = new MultiDemo2();
Thread t1 = new Thread(m);
t1.start();
Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
