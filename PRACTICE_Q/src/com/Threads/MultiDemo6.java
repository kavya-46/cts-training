package com.Threads;
//InterThread Communication:
//the methods should be synchronised
//we use 3 methods in total - Wait(),NOTIFY(),NOTIFYALL()
//NOTIFY()- CAN CALL ONLY SINGLE WEIGHT METHOD
//NOTIFYALL() - CAN CALL ALL THE THREADS

public class MultiDemo6 {
    int amount = 10800;
    public synchronized void withdraw(int amount) {
        //can only accept single parameter
        System.out.println("Going to withdraw");
        if (this.amount < amount) { //this-for accessing instance var
            System.out.println("Less Balance waiting to deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.amount -= amount; //this.amount = this.amount-amount
        System.out.println("withdraw completed");
        notify();
    }
    public synchronized void Deposit(int amount) {
        System.out.println("Going to deposit");
        this.amount += amount;
        System.out.println("Deposit completed");
        notify();

    }
}
   class InterThreadDemo {
       public static void main(String[] args) {

//           Thread t1 = new Thread();
//           t1.start();
           MultiDemo6 c = new MultiDemo6();
           new Thread() {
               public void run() {
                  // MultiDemo6 c = new MultiDemo6();
                   c.withdraw(15000);
                  // c.Deposit(1200);
               }
           }.start();

           new Thread() {
           public void run() {
              // MultiDemo6 c = new MultiDemo6();
               c.Deposit(15000);
           }
       }.start();
       }
   }
