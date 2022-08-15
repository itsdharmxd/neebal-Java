package com.multithreading;

import static java.lang.Thread.sleep;

/**
 * both wait and notify should be in synchronize block
 */


public class WaitAndNotify {
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
                e.printStackTrace();
            }
        }}
        balance-=amount;
        System.out.println("withdrawn");

    }

    void deposit(int amount){
        balance+=amount;
        System.out.println("Deposited");
        /**
         * releasing with this object
         */
        synchronized (this){
            notify();
        }

    }

    public static void main(String[] args) {
      InteruptUse interuptUse =new InteruptUse();

      new Thread(new Runnable() {
          @Override
          public void run() {
              interuptUse.withdraw(1000);
          }
      }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                interuptUse.deposit(1000);
            }
        }).start();




    }

}
