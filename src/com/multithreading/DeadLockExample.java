package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * a situation when two or more thread tries to access one resource simultaneously
 */
public class DeadLockExample {
  static   String lock1="lock1",lock2="lock2";
  static Lock lock=new ReentrantLock();    /// we use  reentrancelock to counter deadlock
    /**
     *Will create a deadlock because lock 1 and lock 2 are occupied and at fist we have to release  lock
     */
    public static void main(String[] args) {

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
    //      lock.lock();
                synchronized (lock1){
              System.out.println("thread 1 lock 1");
              synchronized (lock2){
                  System.out.println("thread 1 lock 2");
              }

          }
    //      lock.unlock();

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
      //          lock.lock();
                synchronized (lock2){
                    System.out.println("thread 2 lock 2");
                    synchronized (lock1){
                        System.out.println("thread 2 lock 1");
                    }

                }
       //         lock.unlock();


            }
        });
        thread1.start();
        thread2.start();

    }


}
