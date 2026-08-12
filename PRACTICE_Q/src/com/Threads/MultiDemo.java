package com.Threads;
//There are 2 ways to create a thread -
//1.extending a thread class
//2. Implementing the Runnable interface
class MultiDemo implements Runnable { //runnable is a built in interface
    String name;
    MultiDemo(String name1) {
        name = name1;
    }
    public void run() {
//        Thread t = Thread.currentThread();
//        System.out.println(t);
//        System.out.println("Thread is running");
        for(int i=1;i<=10;i++) {
            System.out.println(name+":" +i);
        }
    }
    public static void main(String[] args) {
        MultiDemo m1 = new MultiDemo("Thread1");
        MultiDemo m2 = new MultiDemo("Thread2");
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
        for(int i=0;i<=10;i++) {
            System.out.println("main: "+i);
        }
    }
}
