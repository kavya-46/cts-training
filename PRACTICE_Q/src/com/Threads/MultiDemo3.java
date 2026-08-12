package com.Threads;
//Multiple threads- performing multiple opers
//the output can be printed in any order
public class MultiDemo3 implements Runnable{
    String name;
    MultiDemo3(String name1) { //constructor
        name = name1;
    }
    public void run() {
        for(int i=1;i<=10;i++) {
            //IMPLEMENTING SLEEP METHOD
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            Thread t = Thread.currentThread(); //for knowing abt the current thread
            System.out.println(name + ":" + i);
        }
        }

    public static void main(String[] args) {
        MultiDemo3 m1 = new MultiDemo3("thread1");
        Thread t1 = new Thread(m1);
        MultiDemo3 m2 = new MultiDemo3("Thread2");
        Thread t2 = new Thread(m2);
        t1.start();
        //JOIN METHOD
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<=10;i++) {
            System.out.println("Hello" + i);
        }
    }
}

//THREAD SCHEDULER - IN JVM
//JVM, JDK, JRE
//PRE-EMPTIVE SCHEDULING- SCHEDULING DONE ACCORDING TO THE THREAD PRIORITY
//HIGHEST PRIORITY - FIRST PRINTED
//TIME SLICING PROPERTY -PREDEFINED SLICE TIME- ACT ACCORDING TO THE TIME ALLOTED IT IS EXECUTED, IF NOT DONE,THEN THE THREAD GOES TO WAIT STATE.
//join method- for ordered printing of threads
//join method can be used to pause the current thread execution until the specified thread is dead