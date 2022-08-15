package com.multithreading;

import static java.lang.Thread.sleep;

/**
 *  any thread is in sleeping or waiting for a state then using the interrupt()
 *  method, we can interrupt the execution of that thread by showing InterruptedException.
 *  A thread that is in the sleeping or waiting
 *  state can be interrupted with the help of the interrupt() method of Thread class.
 */


public class InteruptUse {
    volatile private  int balance=0;

    void withdraw(int amount) {
        /**
         * lock with this object
         */
        synchronized (this){
            if(balance<=0){
                try {
                    System.out.println("Waiting");
                    /**
                     * waiting until notify method runs
                     */
                    wait();

                }catch (InterruptedException e){
                    System.out.println("interupt occurr");
                    balance-=amount;
                    System.out.println("withdrawn");
                    return;
                }
            }}


    }

    void deposit(int amount){
        balance+=amount;
        System.out.println("Deposited");
        /**
         * releasing with this object
         */


    }

    public static void main(String[] args) {
        InteruptUse interuptUse =new InteruptUse();

      Thread thread1=  new Thread(new Runnable() {
            @Override
            public void run() {
                interuptUse.withdraw(1000);
            }
        });
      thread1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                interuptUse.deposit(1000);
                thread1.interrupt();
            }
        }).start();




    }

}
