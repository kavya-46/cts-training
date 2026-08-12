package com.Threads;
class ThreadDemo extends Thread { //here Thread is built in class
    public void run() {
        System.out.println("run method executed by jvm");
    }

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread t = new Thread(td); //creating obj of thread class and passing the obj of main class to it
        t.start(); //for starting the thread
//run method is executed by JVM in threads
    }
}
